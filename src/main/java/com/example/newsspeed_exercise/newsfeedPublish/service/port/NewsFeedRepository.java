package com.example.newsspeed_exercise.newsfeedPublish.service.port;

import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedDetails;

public interface NewsFeedRepository {
    NewsFeedDetails insert(NewsFeedDetails newsFeedDetails);
}
