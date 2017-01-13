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

    @MessageMapping("/pushMessaging")//服务端接收消息地址（实际是/app/pushMessaging）
    public void messaging(Messagings messagings) throws Exception {
        simpMessageSendingOperations.convertAndSendToUser(messagings.getId(), "/topic/messagings",
                messagings.getContent());//向客户端推送消息（用户id， 订阅地址，消息内容）
    }
}