package ue.edu.ucu.apps.task1;

import java.time.LocalDate;

public class MyTwitterUser implements User {
    private TwitterUser twitUser;

    public MyTwitterUser(TwitterUser tUser) {
        this.twitUser = tUser;
    }

    @Override
    public String getEmail() {
        return twitUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitUser.getCountry();
    }

    @Override
    public LocalDate getLasActiveDate() {
        return twitUser.getLastActiveTime().toLocalDate();
    }
}
