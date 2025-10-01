package com.example.newsspeed_exercise.newsfeedPublish.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NewsFeedPublishReqDto {
    private String publisherId;
    private String message;

    public NewsFeedPublishReqDto(String publisherId, String message) {
        this.publisherId = publisherId;
        this.message = message;
    }
}
