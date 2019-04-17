package com.javacore.epam.profile;

import com.javacore.epam.common.BaseView;
import com.javacore.epam.common.Canvas;

public class ProfileView extends BaseView {

    @Override
    public void draw(Canvas canvas) {
        canvas.drawSquare(10);
        canvas.drawText("Criminal Profile view");
        canvas.drawText("ID: " + ((ProfileModel) model).getId());
        canvas.drawText("Name: " + ((ProfileModel)model).getName());
        canvas.drawText("Active: " + ((ProfileModel)model).isActive());
    }
}
