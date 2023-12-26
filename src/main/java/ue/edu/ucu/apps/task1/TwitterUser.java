package ue.edu.ucu.apps.task1;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TwitterUser {
    private String userMail;
    private String country;
     private LocalDateTime lastActiveTime; 
}
