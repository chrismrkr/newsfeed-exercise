package com.example.newsspeed_exercise.newsfeedPublish.service;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;
import com.example.newsspeed_exercise.newsfeedPublish.controller.port.NewsFeedPublishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NewsFeedPublishServiceImpl implements NewsFeedPublishService {
    @Override
    public boolean publish(NewsFeedPublishReqDto requestDto) {
        // 1. Insert DB

        // 2. Update Cache

        // 3. Call NewsFeed Transfer API
        return false;
    }
}
