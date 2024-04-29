package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        Set<String> participants = new HashSet<String>();
        participants.add("jaeha");

        meeting.validateAndUpdate(new UpdateMeeting(
                "미팅룸1",
                "agenda1",
                participants,
                "책읽기 스터디",
                ZonedDateTime.now(),
                ZonedDateTime.now()
        ));
    }
}
