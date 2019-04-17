package com.javacore.epam.command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandTime extends ACommand {
    public CommandTime(String name){
        super(name);
    }

    @Override
    public void execute() {
        SimpleDateFormat simpleDate = new SimpleDateFormat("kk:mm:ss a");
        System.out.println(simpleDate.format(new Date()).toString());
    }
}
