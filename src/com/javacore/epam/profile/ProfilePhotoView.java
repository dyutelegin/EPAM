package com.javacore.epam.profile;

import com.javacore.epam.common.BaseView;
import com.javacore.epam.common.Canvas;

public class ProfilePhotoView extends BaseView {

    private int x;
    private int y;
    private int size;

    public ProfilePhotoView(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    }
    @Override
    public void draw(Canvas canvas){
        canvas.drawSquareAt(x, y, size);
    }

}
