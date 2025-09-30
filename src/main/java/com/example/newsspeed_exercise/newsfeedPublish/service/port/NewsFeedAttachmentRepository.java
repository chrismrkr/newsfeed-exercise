package com.example.newsspeed_exercise.newsfeedPublish.service.port;

import com.example.newsspeed_exercise.newsfeedPublish.domain.NewsFeedAttachment;
import org.springframework.web.multipart.MultipartFile;

public interface NewsFeedAttachmentRepository {
    boolean save(NewsFeedAttachment newsFeedAttachment);
}
