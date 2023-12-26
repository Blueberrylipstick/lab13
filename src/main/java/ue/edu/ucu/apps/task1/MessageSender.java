package ue.edu.ucu.apps.task1;

import java.time.LocalDateTime;
import java.util.List;

public class MessageSender {
    private List<User> users;

    public MessageSender(List<User> db) {
        this.users = db;
    }

    public void send(String text, String country) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextHour = now.plusHours(1);

        for (User userr: users) {
            if (userr.getCountry().equalsIgnoreCase(country)
            && userr.getLasActiveDate().isAfter(now.toLocalDate())
            && userr.getLasActiveDate().isBefore(nextHour.toLocalDate())) {
                sendMessage(text, userr);
            }
        }
    }

    private void sendMessage(String text, User userr) {
        String mail = userr.getEmail();
        System.out.println("Message" + text
        + "was sent to this email: " + mail);
    }
}
