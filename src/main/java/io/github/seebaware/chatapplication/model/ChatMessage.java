package io.github.seebaware.chatapplication.model;

import io.github.seebaware.chatapplication.utils.MessageType;

public record ChatMessage(String content, String sender, MessageType messageType) { }
