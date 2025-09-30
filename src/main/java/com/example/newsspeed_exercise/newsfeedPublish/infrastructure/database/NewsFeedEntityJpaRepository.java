package com.example.newsspeed_exercise.newsfeedPublish.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsFeedEntityJpaRepository extends JpaRepository<NewsFeedEntity, String> {
}
