package com.javacore.epam.command;

import com.javacore.epam.common.ConsoleCanvas;

public class CommandShow extends ACommand {
    public CommandShow(String name) {
        super("show", "show the criminal's profile by his/her id");
    }

    @Override
    public void execute() {
        ConsoleCanvas canvas = new ConsoleCanvas(20, 40);
        canvas.drawCircle(10, 7, 5);
        canvas.drawSquare(15, 2, 10);
        canvas.draw();
    }
}
