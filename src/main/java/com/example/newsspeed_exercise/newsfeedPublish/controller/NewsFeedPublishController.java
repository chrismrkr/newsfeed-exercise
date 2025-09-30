package com.example.newsspeed_exercise.newsfeedPublish.controller;

import com.example.newsspeed_exercise.newsfeedPublish.controller.dto.NewsFeedPublishReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class NewsFeedPublishController {

    @PostMapping(value = "/newsfeed", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createNewsFeed(@RequestPart("meta") NewsFeedPublishReqDto dto,
                                            @RequestPart("attachment") Optional<MultipartFile> attachment) {

        return (ResponseEntity<?>) ResponseEntity.ok();
    }
}
