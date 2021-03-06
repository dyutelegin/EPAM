package com.javacore.epam.profile;

import com.javacore.epam.common.BaseModel;
import com.javacore.epam.db.Record;

import java.util.Date;

public class ProfileModel extends BaseModel {
    private int id;
    private String firstName;
    private  String lastName;
    private boolean active;
    private boolean deceased;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private int numberOfCrimes;
    private String nickname;
    private int crimeFamilyId;


    public boolean isDeceased() {
        return deceased;
    }

    public ProfileModel setDeceased(boolean deceased) {
        this.deceased = deceased;
        return this;
    }

    public ProfileModel(){}

    public static ProfileModel randomModel(){
        int rId = (int) (10*Math.random());
        boolean rActive = rId % 2 == 0;
        String rFirstName = "Steve_" + rId;
        String rLastName  = "Balmer_" + rId;
        return new ProfileModel(rId, rFirstName, rLastName, rActive);
    }

 /*   public static ProfileModel modelFromRecord(Record record){
        ProfileModel model = new ProfileModel();
        try {
            model.setId(record.getInt("id"));
            model.setDeceased(record.getBoolean("deceased"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    };*/

    public ProfileModel(int id, String firstName, String lastName, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
}
