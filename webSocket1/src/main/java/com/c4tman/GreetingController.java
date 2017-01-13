package com.c4tman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by C4TMAN on 2016/9/29.
 */
@RestController
public class GreetingController {
    @Autowired
    private SimpMessageSendingOperations simpMessageSendingOperations;

    @MessageMapping("/pushMessaging")
    public void messaging(Messagings messagings) throws Exception {
        simpMessageSendingOperations.convertAndSendToUser(messagings.getId(), "/topic/messagings",
                messagings.getContent());
    }
}