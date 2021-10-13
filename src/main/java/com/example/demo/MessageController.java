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
        System.out.println(hook);
        return "ok";
    }
        /*for (SecondaryDto message : hook.getMessages()) {
            if (message.getFromMe())
                continue;
            String option = message.getBody().split(" ")[0].toLowerCase();
            switch (option) {
                case "chatid":
                    ApiWA.sendChatId(message.getChatId());
                    break;
             *//*   case "file":
                    var texts = message.getBody().split(" ");
                    if (texts.length > 1)
                        ApiWA.sendFile(message.getChatId(), texts[1]);
                    break;
                case "ogg":
                    ApiWA.sendOgg(message.getChatId());
                    break;
                case "geo":
                    ApiWA.sendGeo(message.getChatId());
                    break;
                case "group":
                    ApiWA.createGroup(message.getAuthor());
                    break;
                default:
                    ApiWA.sendDefault(message.getChatId());
                    break;*//*

            }
        }
        return "ok";
    }*/
}