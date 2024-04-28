package com.ai.springopenai.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ChatController {

    private final ChatClient chatClient;

    @GetMapping("/chat")
    public String generate(@RequestParam(value = "message") String message){
            return chatClient.call(message);
    }
}
