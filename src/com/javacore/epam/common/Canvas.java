package com.javacore.epam.common;


public abstract class Canvas {


    public abstract void drawText(String text);
    public abstract void drawSquare(int size);
    public abstract void drawSquareAt(int x, int y, int size);

    public Canvas() {
    }
}