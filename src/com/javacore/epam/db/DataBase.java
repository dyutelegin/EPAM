package com.javacore.epam.db;

import java.util.List;
import java.util.Map;

public class DataBase {
    Map<String, Table> tables;
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
