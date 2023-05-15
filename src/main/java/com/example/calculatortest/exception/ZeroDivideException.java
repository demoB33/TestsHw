package com.example.calculatortest.exception;

public class ZeroDivideException  extends IllegalArgumentException{

    public ZeroDivideException() {
    }

    public ZeroDivideException(String s) {
        super(s);
    }

    public ZeroDivideException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDivideException(Throwable cause) {
        super(cause);
    }

}
