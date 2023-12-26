package ue.edu.ucu.apps.task1;

import java.time.LocalDate;

public interface User {
    String getEmail();
    String getCountry();
    LocalDate getLasActiveDate();
}
