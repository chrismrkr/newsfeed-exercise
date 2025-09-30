package com.example.newsspeed_exercise.newsfeedPublish.service;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;
import com.example.newsspeed_exercise.newsfeedPublish.controller.port.NewsFeedPublishService;
import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedAttachment;
import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedDetails;
import com.example.newsspeed_exercise.newsfeedPublish.service.port.NewsFeedAttachmentRepository;
import com.example.newsspeed_exercise.newsfeedPublish.service.port.NewsFeedRepository;
import com.example.newsspeed_exercise.newsfeedPublish.service.port.NewsFeedTransferInvoker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class NewsFeedPublishServiceImpl implements NewsFeedPublishService {
    private final NewsFeedRepository newsFeedRepository;
    private final NewsFeedAttachmentRepository newsFeedAttachmentRepository;
    private final NewsFeedTransferInvoker newsFeedTransferInvoker;

    @Override
    @Transactional
    public void publish(NewsFeedPublishReqDto requestDto, Optional<MultipartFile> attachment) {
        if(attachment.isEmpty()) {
            publish(requestDto);
            return;
        }

        String newFeedId = String.valueOf(UUID.randomUUID());
        NewsFeedDetails newsFeedDetails = NewsFeedDetails.create(newFeedId, requestDto);
        newsFeedRepository.insert(newsFeedDetails);

        NewsFeedAttachment newsFeedAttachment = NewsFeedAttachment.builder().id(newFeedId).file(attachment.get()).build();
        newsFeedAttachmentRepository.save(newsFeedAttachment);

        newsFeedTransferInvoker.transferNewsFeed(newFeedId, newsFeedDetails.getPublisherId());
    }

    protected void publish(NewsFeedPublishReqDto requestDto) {
        String newFeedId = String.valueOf(UUID.randomUUID());
        NewsFeedDetails newsFeedDetails = NewsFeedDetails.create(newFeedId, requestDto);
        newsFeedRepository.insert(newsFeedDetails);
        newsFeedTransferInvoker.transferNewsFeed(newFeedId, newsFeedDetails.getPublisherId());
    }
}
