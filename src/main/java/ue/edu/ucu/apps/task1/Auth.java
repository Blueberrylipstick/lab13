package ue.edu.ucu.apps.task1;

public class Auth {
    public User logIn() {
        int n = 0;
        if (n > 0) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(User user) {
        String country = user.getCountry();
    }
}
