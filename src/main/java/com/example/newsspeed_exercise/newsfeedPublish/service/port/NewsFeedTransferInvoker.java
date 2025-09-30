package com.example.newsspeed_exercise.newsfeedPublish.service.port;

public interface NewsFeedTransferInvoker {
    boolean transferNewsFeed(String newFeedId, String publisherId);
}
