package com.zwk.lisp.exception;

public class LispSyntaxErrorException extends RuntimeException{
    public LispSyntaxErrorException(String message) {
        super(message);
    }
}
