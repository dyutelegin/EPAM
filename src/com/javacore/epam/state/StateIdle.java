package com.javacore.epam.state;

import com.javacore.epam.Application;

public class StateIdle extends ApplicationState {
    @Override
    public void enter(String commandName) {
        System.out.println("Entering Idle state");
    }

    @Override
    public void onCommand(String commandName) {
        System.out.println("New command received, starting executing..." + commandName);
        Application.changeState(new StateExecutingCommand(), commandName);
    }

    @Override
    public void exit() {
        System.out.println("Exiting idle state");
    }
}
