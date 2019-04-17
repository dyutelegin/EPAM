package com.javacore.epam.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {

    protected String name;
    protected List<String> columns;
    protected List<Record> records;
    protected List<String> values;

    {
        records = new ArrayList<Record>();
    }

    public Table(String name, List<String> columns){
        this.name = name;
        this.columns = columns;
    }

    public void insert(Record record){
        records.add(record);
    }

    //SELECT id, firstName, lastName;
    public void select(String quaery){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("Loading");
                for(int i = 0; i < 20; i++) {
                    System.out.print(".");
                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e){
                    }
                }
                System.out.println("done");
                for(int i = 0; i < 35; i++){
                    System.out.print("-");
                }
                System.out.print("\n");
                for (String s : columns){
                    System.out.print(" " + s+ "       ");
                }
                System.out.print("\n");
                for(int i = 0; i < 35; i++){
                    System.out.print("-");
                }
                if(quaery.equals(values))
                for(String s: values){
                    System.out.print(s);
                }
            }
        };
        new Thread(runnable).start();
    }

    public List<String> selectField(String fieldName){
        int index = columns.indexOf(fieldName);
        Iterator it = records.iterator();
        List<String> result = new ArrayList<>();
        while (it.hasNext()) {
            Record r = (Record) it.next();
            result.add(r.values.get(index));
        }
        return result;
    }

}
