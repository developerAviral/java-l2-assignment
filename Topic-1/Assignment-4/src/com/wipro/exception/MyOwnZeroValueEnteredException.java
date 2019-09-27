package com.wipro.exception;

public class MyOwnZeroValueEnteredException extends ArithmeticException {
    public MyOwnZeroValueEnteredException(int i){
        super(" the\n" +
                "zero number that was entered." + i);
    }
}
