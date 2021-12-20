grammar Lisp ;

/*
 支持聚合、计算、case when、cast、函数调用

 聚合：sum、count、avg、max、min，其中INT代表字段的ID(字段Id需要自己去处理) parseExpression属于内嵌的表达式

 计算：两个表达式进行计算

 case： 有两种情况
    1、(case 123 ((int 1)) 2 3)其中123代表字段id   -->case id when 1 then 2 else 3 end
    2、(case (= 123 (int 1)) 2 3)其中123代表字段id  -->case when id = 1 then  2  else 3 end
    或者(case (and (= 123 (int 1)) (=456 'zs')) 2 3) --> case when id = 1 and name = 'zs' then  2  else 3 end

 cast: cast(id as varchar)type是字符串也可以，是字符串则支持带精度的cast
    例如：(cast 'decimal(10,2)' 123)其中123代表字段id    --> cast(price as decimal(10,2))

 call:函数调用funcName函数名，任意函数名，参数可以是支持的任意表达式
    (call now)  -->now()
    (call concat 123 '456')其中123代表字段id  -->concat(id,'456')
    (call date_format 123 '%Y-%m-%d')其中123代表字段id  -->date_format(date,'%Y-%m-%d')
*/

lisp: parseExpresion EOF;

parseExpresion
        : aggregate         #aggregateExpression
        | calculate         #calculateExpression
        | caseBranch        #caseExpression
        | cast              #castExpression
        | call              #callExpression
;
aggregate: '(' aggFuncName = AGGFUNC (INT | parseExpresion) ')';

calculate: '(' op = OPERATOR left = commonExpression right = commonExpression ')';

commonExpression
            : valueExpression   #commonValueExpression
            | parseExpresion    #commonParseExpression
            ;

caseBranch
    : '(' CASE whenClause+ elseValue=valueExpression?')'                #conditionCase
    | '(' CASE id = INT whenClause+ elseValue=valueExpression?')'       #simpleCase
    ;

cast: '(' CAST type = castType id = INT ')';

call: '(' CALL funcName = ID (commonExpression)* ')';

castType: ID | STRINGWORD | INTWORD | STRING;

whenClause
          : cond = simpleClause value = valueExpression        #simpleWhenClause
          | cond = conditionClause value = valueExpression     #conditionWhenClause
          ;

simpleClause: '(' cond = valueExpression ')';

conditionClause
                : '(' op = OPERATOR id = INT cond = valueExpression ')'                 #singleConditionClause
                | '(' op = (AND |OR) left = conditionClause right = conditionClause ')' #multiConditionClause
                ;
//INT和intValue是为了区分到底是字段id还是int类型的数值，单纯的INT代表字段ID，intValue代表字面量int值
valueExpression
                : INT                       #intLiteralValueExpression
                | DOUBLE                    #doubleLiteralValueExpression
                | STRING                    #stringLiteralValueExpression
                | intValue                  #intValueExpression
                | string                    #stringValueExpression
                ;

intValue: '(' INTWORD INT ')';

string: '(' STRINGWORD STRING ')';

OPERATOR: MUL|DIV|PLUS|SUB|EQUAL|GT|LT|GE|LE|NE;

AGGFUNC: COUNT|SUM|AVG|MAX|MIN;

LPAREN : '(';

RPAREN : ')';

COUNT: 'COUNT';

SUM: 'SUM';

AVG: 'AVG';

MAX: 'MAX';

MIN: 'MIN';

CAST: 'CAST';

CALL: 'CALL';

CASE: 'CASE';

INTWORD: 'INT';

STRINGWORD:'STRING';

AND: 'AND';

OR: 'OR';

INT: DIGIT+;

DOUBLE: INT '.' INT;

ID: LETTER (LETTER | DIGIT | '_')*;


STRING: '\'' (.*?) '\'';

fragment LETTER:[A-Z];

fragment DIGIT: [0-9];

fragment MUL:'*';

fragment DIV:'/';

fragment PLUS:'+';

fragment SUB:'-';

fragment EQUAL:'=';

fragment GT:'>';
fragment LT:'<';
fragment GE:'>=';
fragment LE:'<=';
fragment NE:'<>' | '!=';

COMMENT: '/*' .*? '*/'->skip;

WS: [ \t\r\n] -> skip;