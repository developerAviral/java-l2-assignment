package com.wipro.utils;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FileReadWriteUtils {

    public void writeToFile(Date todaysDate, Double doubleVar, Long longVar) throws IOException {
        Random random = new Random();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String reportDate = df.format(todaysDate);

        /* Folder and File creation*/
      //  File folder = new File("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-2\\Assignment-1\\src\\"+random);
        File file = new File("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-2\\Assignment-1\\src\\testData.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Today's Date " +reportDate +"\n");
        bw.write("Double Object " +doubleVar +"\n");
        bw.write("Long Object " +longVar +"\n");
        bw.close();
    }

    public void readFromFile() throws IOException{
        File file = new File("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-2\\Assignment-1\\src\\testData.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while((str= br.readLine()) != null){
            System.out.println(str);
        }
    }
}
