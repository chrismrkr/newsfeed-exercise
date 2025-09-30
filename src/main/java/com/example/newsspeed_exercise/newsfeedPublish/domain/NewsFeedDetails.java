package com.example.newsspeed_exercise.newsfeedPublish.domain;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsFeedDetails {
    private String id;
    private String publisherId;
    private LocalDateTime publishDateTime;
    private String message;
    @Builder
    private NewsFeedDetails(String id, String publisherId, LocalDateTime publishDateTime, String message) {
        this.id = id;
        this.publisherId = publisherId;
        this.publishDateTime = publishDateTime;
        this.message = message;
    }

    public static NewsFeedDetails create(String id, NewsFeedPublishReqDto reqDto) {
        return NewsFeedDetails.builder()
                .id(id)
                .publisherId(reqDto.getPublisherId())
                .publishDateTime(LocalDateTime.now())
                .message(reqDto.getMessage())
                .build();
    }
}
