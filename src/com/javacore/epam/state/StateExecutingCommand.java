package com.javacore.epam.state;

import com.javacore.epam.Application;

public class StateExecutingCommand extends ApplicationState {
    @Override
    public void enter(String commandName) {
        System.out.println("Entering State Excecuting command..." +commandName);
        executeCommand(commandName);
    }

    private void executeCommand(String commandName){
 //       Application.
    }

    @Override
    public void onCommand(String commandName) {
        System.out.println("Busy executing command, your new command : " + commandName + " has to wait");
    }

    @Override
    public void exit() {
        System.out.println("Leaving state executing command.");
    }
}
