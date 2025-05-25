package com.example.springbootsample;

import org.springframework.stereotype.Service;



@Service
public class AiService {

    //private final ChatClient chatClient;

    public AiService(){ //ChatClient.Builder builder) {
        //this.chatClient = builder.build();
    }
    
    public String chat(String prompt){
        return "Hello, " + prompt;
        // return this.chatClient.call(prompt);
    }
}