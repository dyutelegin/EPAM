package com.javacore.epam.command;

import com.javacore.epam.common.ConsoleCanvas;

public class CommandShow extends ACommand {
    public CommandShow(String name) {
        super("show", "show the criminal's profile by his/her id");
    }

    @Override
    public void execute() {
        ConsoleCanvas canvas = new ConsoleCanvas(80, 33);
        canvas.drawTextAt(2,2, "John Delinger");
        canvas.drawCircle(6, 72, 4);
        canvas.drawSquare(11, 68, 8);
        canvas.draw();
    }
}
