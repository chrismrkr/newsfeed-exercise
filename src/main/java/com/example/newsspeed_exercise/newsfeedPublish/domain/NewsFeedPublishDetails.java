package com.example.newsspeed_exercise.newsfeedPublish.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsFeedPublishDetails {
    private String publisherId;
    private LocalDateTime publishDateTime;
    private String message;
    private Object media;
    @Builder
    private NewsFeedPublishDetails(String publisherId, LocalDateTime publishDateTime, String message, Object media) {
        this.publisherId = publisherId;
        this.publishDateTime = publishDateTime;
        this.message = message;
        this.media = media;
    }
}
