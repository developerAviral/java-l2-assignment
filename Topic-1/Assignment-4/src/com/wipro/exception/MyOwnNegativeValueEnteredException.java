package com.wipro.exception;

public class MyOwnNegativeValueEnteredException extends ArithmeticException {
   public MyOwnNegativeValueEnteredException(int i){
        super(" the\n" +
                "negative number that was entered." + i);
    }
}
