package ue.edu.ucu.apps.task2;

public class Database extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return отриматиСтатистичніДані();
    }
}
