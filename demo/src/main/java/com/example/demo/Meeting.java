package com.example.demo;

import java.time.ZonedDateTime;
import java.util.Set;

public class Meeting extends AbstractEvent {
    private String meetingRoom;
    private String agenda;
    private Set<String> participants;

    public void update(
            String title,
            ZonedDateTime starAt,
            ZonedDateTime endAt,
            boolean deletedYn,
            String meetingRoom,
            String agenda,
            Set<String> participants
    ) {
        if (this.deletedYn) {
            throw new RuntimeException("이미 삭제된 데이터이기 떄문에 값을 업데이트 할 수 없습니다.");
        }
        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
        this.participants = participants;
    }

    @Override
    protected void update(AbstractAuditableEvent event) {
        UpdateMeeting meeting = (UpdateMeeting) event;
        this.participants = meeting.getParticipants();
        this.agenda = meeting.getAgenda();
        this.meetingRoom = meeting.getMeetingRoom();
    }
}
