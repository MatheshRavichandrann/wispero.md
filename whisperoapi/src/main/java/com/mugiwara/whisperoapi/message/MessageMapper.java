package com.mugiwara.whisperoapi.message;

import com.mugiwara.whisperoapi.file.FIleUtils;
import org.springframework.stereotype.Service;

@Service
public class MessageMapper {
    public MessageResponse toMessageResponse(Message message) {
        return MessageResponse.builder()
                .id(message.getId())
                .content(message.getContent())
                .senderId(message.getSenderId())
                .receiverId(message.getReceiverId())
                .type(message.getType())
                .state(message.getState())
                .createdAt(message.getCreatedDate())
                .media(FIleUtils.readFileFromLocation(message.getMediaFilePath()))
                .build();


    }
}
