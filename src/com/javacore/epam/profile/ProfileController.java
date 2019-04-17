package com.javacore.epam.profile;

import com.javacore.epam.common.ConsoleCanvas;

public class ProfileController {

    private ProfileModel profileModel;
    private ProfileView view;
    private ProfileStore store;
    private static ConsoleCanvas canvas;

    //1

    //2
    {
        store.INSTANCE.loadDate();
        view = new ProfileView();

    }

    public void showProfile (int id){
        ProfileModel model = store.INSTANCE.getProfile(id);
        if(model == null){
            System.out.println("NO record found with id : " + id);
        }
        else {
            view.setModel(model);
            view.draw(canvas);
        }
    }
    //3
    public ProfileController() {
    }

    public ProfileModel getProfileModel() {
        return profileModel;
    }

    public void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
    }

    public ProfileView getView() {
        return view;
    }

    public void setView(ProfileView view) {
        this.view = view;
    }
}
