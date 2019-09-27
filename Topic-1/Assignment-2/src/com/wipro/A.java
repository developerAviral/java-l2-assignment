package com.wipro;

public class A {
    public static int noOfFinalizeMethodCalled;
    @Override
    protected void finalize() throws Throwable {
        noOfFinalizeMethodCalled += 1;
        System.out.println("Finalize method called");
    }
}
