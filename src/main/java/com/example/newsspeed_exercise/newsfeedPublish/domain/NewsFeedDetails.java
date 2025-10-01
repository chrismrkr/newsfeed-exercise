package com.example.newsspeed_exercise.newsfeedPublish.domain;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;
import com.example.newsspeed_exercise.newsfeedPublish.infrastructure.database.NewsFeedEntity;
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

    public NewsFeedEntity toEntity() {
        return NewsFeedEntity.builder()
                .id(this.id)
                .publisherId(this.publisherId)
                .publishDateTime(this.publishDateTime)
                .message(this.message).build();
    }

    public static NewsFeedDetails from(NewsFeedEntity entity) {
        return NewsFeedDetails.builder()
                .id(entity.getId())
                .publisherId(entity.getPublisherId())
                .publishDateTime(entity.getPublishDateTime())
                .message(entity.getMessage())
                .build();
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
