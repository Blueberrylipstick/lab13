package ue.edu.ucu.apps.task1;

import java.time.LocalDate;

public class MyFacebookUser implements User {
    private FacebookUser faceUser;

    public MyFacebookUser(FacebookUser fUser) {
        this.faceUser = fUser;
    }

    @Override
    public String getEmail() {
        return faceUser.getEmail();
    }

    @Override
    public String getCountry() {
        return faceUser.getUserCountry();
    }

    @Override
    public LocalDate getLasActiveDate() {
        return faceUser.getUserActiveTime().toLocalDate();
    }
    
}
