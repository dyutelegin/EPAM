package com.javacore.epam.command;

public abstract class ACommand {
    private String name;
    protected String description;

    public ACommand(String name){
        this.name = name;
    }

    public ACommand(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void execute(){
        System.out.println("Command " + name +  " not implemented");
    }
}
