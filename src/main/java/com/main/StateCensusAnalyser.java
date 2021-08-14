package com.main;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class StateCensusAnalyser {

    /*Method to analyse data from the indian census comma separated file*/
    public void analyseCensusData() throws FileNotFoundException {
        String path = "C:\\Users\\prata\\IndiaStateCensusData.csv";
        String line = "";
        String splits =",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try{
            while ((line = bufferedReader.readLine()) != null){
                String [] data = line.split(splits);
                System.out.println("State: "+data[0]+", Population: "+data[1]+", Area: "+data[2]+", Density: "+data[3]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /*Method to analyse data from the indian states and its code comma separated file */
    public void analyseIndianStateCode() throws FileNotFoundException {
        String path = "C:\\Users\\prata\\IndiaStateCode.csv";
        String line = "";
        String splits =",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try{
            while ((line = bufferedReader.readLine()) != null){
                String [] data = line.split(splits);
                System.out.println("Serial Number: "+data[0]+", State Name: "+data[1]+", TIN: "+data[2]+",State Code: "+data[3]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    /*Main method displaying welcome message*/
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Indian census simulation");
    }
}
