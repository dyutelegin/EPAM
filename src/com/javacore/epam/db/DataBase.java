package com.javacore.epam.db;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBase {
    Map<String, Table> tables;
    public static List<String[]> readDataFile(String fileName){
        FileInputStream fis = null;
        List<String[]> result = new ArrayList<>();
        BufferedReader br;
        try{
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("Source line: "+line);
                result.add(line.split(";"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


//DB.query("SELECT ID, NAME, EMAIL FROM CRIMINALS WHERE ID = ?");
    public List<Record> select(){
        return null;
    }

    public void update(){

    }

    public void delete(){

    }

    public void insert(Record record, Table table){

    }

}
