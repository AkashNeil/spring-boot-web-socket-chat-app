package io.github.seebaware.chatapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType messageType;

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }

}
