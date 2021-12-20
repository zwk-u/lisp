package com.zwk.lisp.parse;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class LispSyntaxErrorListener extends BaseErrorListener {
    private boolean hasError;

    private StringBuilder msg = new StringBuilder();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        hasError = true;
        String template = "line： %d position：%d\n%s";
        this.msg.append(String.format(template, line, charPositionInLine, msg));
    }

    public String msg() {
        return msg.toString();
    }

    public boolean hasError() {
        return hasError;
    }
}
