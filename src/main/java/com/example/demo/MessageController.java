package com.example.demo;

import com.example.demo.dto.SecondaryDto;
import com.example.demo.dto.WebHookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("webhook")
public class MessageController {
    @PostMapping
    public String AnswerWebhook(@RequestBody WebHookDto hook) throws IOException {
        for (SecondaryDto message : hook.getMessages()) {
            String option = message.getBody().split(" ")[0].toLowerCase();
            switch (option) {
                case "chatid":
                    ApiWA.sendChatId(message.getAuthor());
                    break;
            }
        }
        return "ok";
    }
}