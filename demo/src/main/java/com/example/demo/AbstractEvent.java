package com.example.demo;

import java.time.ZonedDateTime;

public abstract class AbstractEvent {
    private String title;
    private ZonedDateTime starAt;
    private ZonedDateTime endAt;
    protected boolean deletedYn;

    public void validateAndUpdate(AbstractAuditableEvent event) {
        if (getDeletedYn()) {
            throw new RuntimeException();
        }

        update(event);
        defaultUpdate(event);
    }

    protected abstract void update(AbstractAuditableEvent event);

    private boolean getDeletedYn() {
        return deletedYn;
    }

    private void defaultUpdate(AbstractAuditableEvent event) {
        this.title = event.getTitle();
        this.starAt = event.getStarAt();
        this.endAt = event.getEndAt();
    }
}
