package com.zwk.lisp.parse;

import com.zwk.lisp.LispLexer;
import com.zwk.lisp.LispParser;
import com.zwk.lisp.ParseVisitor;
import com.zwk.lisp.exception.LispSyntaxErrorException;
import com.zwk.lisp.parse.node.LispNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Parser {
    private final String content;
    private final LispParser parser;
    private final LispSyntaxErrorListener errorListener;

    public Parser(String content) {
        this.content = content;
        this.errorListener = new LispSyntaxErrorListener();
        this.parser = getParser();
    }

    private LispParser getParser() {
        CharStream stream = new CaseInsensitiveStream(CharStreams.fromString(content));
        LispLexer lispLexer = new LispLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lispLexer);
        LispParser parser = new LispParser(tokenStream);
        parser.addErrorListener(errorListener);
        return parser;
    }

    public <C, R> R parse(LispNodeVisitor<C, R> visitor, C context) {
        LispParser.LispContext lisp = parser.lisp();
        if (errorListener.hasError()) {
            throw new LispSyntaxErrorException(errorListener.msg());
        }
        LispNode lispNode = new ParseVisitor().visit(lisp);
        return visitor.visit(lispNode, context);
    }
}
