package com.javacore.epam.command;

import static com.javacore.epam.Application.VERSION;

public class CommandVersion extends ACommand {
    public CommandVersion(String name){
        super(name);
    }
    @Override
    public void execute(){
        System.out.println("My version is : " + VERSION);
    }
}
