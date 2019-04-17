package com.javacore.epam.common;

public class ConsoleCanvas extends Canvas {

    private char[][] pixes;
    private int width;
    private int height;

    public ConsoleCanvas (int width, int height){
        this.width = width;
        this.height = height;
        init();
    }

    public void init() {
        pixes = new char[height][width];
        reset();
    }

    private void reset() {
        for (int i = 0; i<height; i++){
            for (int j=0; j<width; j++){
                pixes[i][j]='.';
            }
        }
    }

    public void draw() {
        for (int i = 0; i<height; i++){
            System.out.print("\n");
            for (int j=0; j<width; j++){
                System.out.print(pixes[i][j]);
            }
        }
    }

    public void setSymbolAt(int x, int y, char symbol){
        pixes[x][y] = symbol;
    }

    public void drawSquareAt(int x, int y, int size) {
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if ((i>= x && i<= x+size) && ((j>=y && j<= y+size))) {
                    System.out.print("#");
                }
            }
            System.out.println("\n");
        }
    }

    public void drawCircleAt(int x, int y, int radius){

    }

    public void drawTextAt(int x, int y, String text){

    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }

    @Override
    public void drawSquare(int size) {
        if (size < 2){
            System.out.println("No squares of such size allowed");
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++){
            System.out.println("#");
        }
        for (int i = 1; i < size - 1; i++) {
            System.out.println("#");
            for (int j = 1; j < size - 1; j++){
                System.out.println(" ");
            }
        }
        for (int i = 0; i < size; i++){
            System.out.println("#");
        }
        System.out.println("\n");
    }
}
