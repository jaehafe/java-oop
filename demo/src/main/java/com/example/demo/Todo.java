package com.example.demo;

import java.time.ZonedDateTime;
import java.util.Set;

public class Todo {
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private boolean deletedYn;

    private String description;

    public void update(
            String title,
            ZonedDateTime starAt,
            ZonedDateTime endAt,
            boolean deletedYn,
            String description
    ) {
        if (this.deletedYn) {
            throw new RuntimeException("이미 삭제된 데이터이기 떄문에 값을 업데이트 할 수 없습니다.");
        }

        this.title = title;
        this.startAt = starAt;
        this.endAt = endAt;
        this.description = description;
    }
}
