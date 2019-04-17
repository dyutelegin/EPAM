package com.javacore.epam.command;

import static com.javacore.epam.Application.AUTHOR;

public class CommandAuthor extends ACommand{
    public CommandAuthor(String name){
        super(name);
    }
    @Override
    public void execute(){
        System.out.println("My author's name is " + AUTHOR);
    }
}
