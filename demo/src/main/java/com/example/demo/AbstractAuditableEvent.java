package com.example.demo;

import java.time.ZonedDateTime;

public abstract class AbstractAuditableEvent {
    private String title;
    private ZonedDateTime starAt;
    private ZonedDateTime endAt;
    private boolean deletedYn;

    AbstractAuditableEvent(String title, ZonedDateTime starAt, ZonedDateTime endAt) {
        this.title = title;
        this.starAt = starAt;
        this.endAt = endAt;
    }

    public String getTitle() {
        return title;
    }

    public ZonedDateTime getStarAt() {
        return starAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }

    public boolean isDeletedYn() {
        return deletedYn;
    }
}
