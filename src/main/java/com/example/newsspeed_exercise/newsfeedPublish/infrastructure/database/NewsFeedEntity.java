package com.example.newsspeed_exercise.newsfeedPublish.infrastructure.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class NewsFeedEntity {
    @Id
    private String id;
    private String publisherId;
    private LocalDateTime publishDateTime;
    private String message;

    @Builder
    private NewsFeedEntity(String id, String publisherId, LocalDateTime publishDateTime, String message) {
        this.id = id;
        this.publisherId = publisherId;
        this.publishDateTime = publishDateTime;
        this.message = message;
    }
}
