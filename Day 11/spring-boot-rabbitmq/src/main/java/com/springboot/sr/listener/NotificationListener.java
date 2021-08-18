package com.springboot.sr.listener;

import com.springboot.sr.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "samet-queue")
    public void handleMessage(Notification notification){
        System.out.println("Message received...");
        System.out.println(notification.toString());

    }
}
