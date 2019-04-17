package com.javacore.epam.state;

public abstract class ApplicationState {
    public abstract void enter(String commandName);

    public abstract void onCommand(String commandName);

    public abstract void exit();
}
