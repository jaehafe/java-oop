package com.example.demo;

import java.time.ZonedDateTime;
import java.util.Set;

public class UpdateMeeting extends AbstractAuditableEvent {
    private String meetingRoom;
    private String agenda;
    private Set<String> participants;

    UpdateMeeting(String meetingRoom, String agenda, Set<String> participants,
                  String title, ZonedDateTime starAt, ZonedDateTime endAt) {
        super(title, starAt, endAt);

        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
        this.participants = participants;
    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public String getAgenda() {
        return agenda;
    }

    public Set<String> getParticipants() {
        return participants;
    }
}
