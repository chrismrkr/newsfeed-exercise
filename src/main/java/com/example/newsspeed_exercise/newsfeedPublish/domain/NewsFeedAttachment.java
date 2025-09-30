package com.example.newsspeed_exercise.newsfeedPublish.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewsFeedAttachment {
    private String id;
    private MultipartFile file;

    @Builder
    private NewsFeedAttachment(String id, MultipartFile file) {
        this.id = id;
        this.file = file;
    }
}
