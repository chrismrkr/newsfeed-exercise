package com.example.newsspeed_exercise.newsfeedPublish.unit.domain;

import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedDetails;
import com.example.newsspeed_exercise.newsfeedPublish.infrastructure.database.NewsFeedEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class NewsFeedDetailsTest {
    @Test
    void NewsFeedDetails를_DB전용_entity로_전환() {
        // given
        String id = "123";
        String publisherId = "456";
        LocalDateTime now = LocalDateTime.now();
        String message = "hello News Feed";
        NewsFeedDetails newsFeedDetails = NewsFeedDetails.builder()
                .id(id)
                .publisherId(publisherId)
                .publishDateTime(now)
                .message(message).build();
        // when
        NewsFeedEntity entity = newsFeedDetails.toEntity();
        // then
        Assertions.assertEquals(entity.getId(), id);
        Assertions.assertEquals(entity.getPublishDateTime(), now);
        Assertions.assertEquals(entity.getPublisherId(), publisherId);
        Assertions.assertEquals(entity.getMessage(), message);
    }

    @Test
    void DB전용_entity를_NewsFeedDetails로_전환() {
        // given
        String id = "123";
        String publisherId = "456";
        LocalDateTime now = LocalDateTime.now();
        String message = "hello News Feed";
        NewsFeedEntity entity = NewsFeedEntity.builder()
                .id(id)
                .publisherId(publisherId)
                .publishDateTime(now)
                .message(message).build();
        // when
        NewsFeedDetails newsFeedDetails = NewsFeedDetails.from(entity);
        // then
        Assertions.assertEquals(newsFeedDetails.getId(), id);
        Assertions.assertEquals(newsFeedDetails.getPublishDateTime(), now);
        Assertions.assertEquals(newsFeedDetails.getPublisherId(), publisherId);
        Assertions.assertEquals(newsFeedDetails.getMessage(), message);
    }
}
