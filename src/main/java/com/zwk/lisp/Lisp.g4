grammar Lisp ;

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