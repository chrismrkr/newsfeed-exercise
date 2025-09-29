package com.example.newsspeed_exercise.newsfeedPublish.controller.port;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;

public interface NewsFeedPublishService {
    /**
     * TODO. 아래가 하나의 트랜잭션으로 처리되도록 할 것
     * 1. 새로운 NewsFeed를 DB에 저장
     * 2. 새로운 NewsFeed를 Cache에 저장
     * 3. 뉴스피드 전송 서비스(API) 호출
     */
    boolean publish(NewsFeedPublishReqDto requestDto);
}
