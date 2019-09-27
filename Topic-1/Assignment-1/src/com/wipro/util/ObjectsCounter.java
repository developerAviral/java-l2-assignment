package com.wipro.util;

public class ObjectsCounter {
    private static int noOfObjects = 0;

    public ObjectsCounter(){
        noOfObjects += 1;
    }

    public static Integer getNumberOfObjects(){

        return noOfObjects;
    }
}
