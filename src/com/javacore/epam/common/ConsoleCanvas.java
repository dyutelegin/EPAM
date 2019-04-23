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
                pixes[i][j]=' ';
            }
        }
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(pixes[row][col]);
            }

            System.out.print("\n");
        }
    }

    public void drawCircle(int cx, int cy, int radius) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                int sqDist = (cx - x) * (cx - x) + (cy - y) * (cy - y);
                if (sqDist <= radius * radius)
                    pixes[x][y] = '#';
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
        for(int i=0; i<text.length(); i++)
        pixes[x][y+i] = text.charAt(i);
    }

    private void drawLine(int x, int y, int xend, int yend) {
        for (int row = x; row <= xend; row++) {
            for (int col = y; col <= yend; col++) {
                pixes[row][col] = '#';
            }
        }
    }
    public void drawSquare(int x, int y, int size) {
        drawLine(x, y, x, y + size);
        drawLine(x, y, x + size, y);
        drawLine(x + size, y, x + size, y + size);
        drawLine(x, y + size, x + size, y + size);
        for (int i = x+1; i< (x+size); i++){
            for (int j=y+1; j< (y+size); j++){
                pixes[i][j] = ' ';
            }
        }
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
