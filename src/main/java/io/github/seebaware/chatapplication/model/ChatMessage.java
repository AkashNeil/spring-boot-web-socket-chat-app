package io.github.seebaware.chatapplication.model;

public record ChatMessage(String content, String sender, MessageType messageType) {

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }

}
