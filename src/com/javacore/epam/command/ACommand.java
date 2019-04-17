package com.javacore.epam.command;

public abstract class ACommand {
    private String name;
    protected String description;

    public ACommand(String name){
        this.name = name;
    }

    public void execute(){
        System.out.println("Command " + name +  " not implemented");
    }
}
