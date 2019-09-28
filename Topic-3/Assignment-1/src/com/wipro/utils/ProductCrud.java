package com.wipro.utils;

import com.wipro.SeqFile;

import java.io.IOException;

public class ProductCrud {
    SeqFile seqFile;

    public void addProduct(String productId, Double cost, Integer noOfItems) throws IOException {
        seqFile = new SeqFile();
        seqFile.writeToFile(productId, cost,noOfItems);
    }

    public Double getTotalValue() throws IOException {
        seqFile =new SeqFile();
        return seqFile.getCostList();
    }

    public void displayAlternateProducts() throws IOException{
        seqFile =new SeqFile();
        seqFile.readAlternateLines();
    }
}
