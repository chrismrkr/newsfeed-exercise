package com.example.newsspeed_exercise.newsfeedPublish.infrastructure.database;

import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedDetails;
import com.example.newsspeed_exercise.newsfeedPublish.service.port.NewsFeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NewsFeedMySQLRepository implements NewsFeedRepository {
    private final NewsFeedEntityJpaRepository jpaRepository;

    @Override
    public NewsFeedDetails insert(NewsFeedDetails newsFeedDetails) {
        NewsFeedEntity entity = newsFeedDetails.toEntity();
        entity = jpaRepository.save(entity);
        return NewsFeedDetails.from(entity);
    }
}
