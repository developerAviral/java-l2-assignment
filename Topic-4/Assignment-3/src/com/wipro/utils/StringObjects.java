package com.wipro.utils;

import java.util.ArrayList;
import java.util.List;

public class StringObjects {
    public List<String> createStringObjectsList(){
        List<String> stringList = new ArrayList<>();
        for(int i =0; i< 10; i++){
            stringList.add("String number: " + i);
        }
        stringList.add("");
        return stringList;
    }
}
