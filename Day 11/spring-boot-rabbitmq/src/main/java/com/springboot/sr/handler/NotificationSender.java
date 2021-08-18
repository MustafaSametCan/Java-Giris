package com.springboot.sr.handler;

import com.springboot.sr.model.Notification;
import com.springboot.sr.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

public class NotificationSender {

    @Autowired
    private NotificationProducer producer;

    public void getThread() {
        Thread thread = new Thread(() -> {
            while (true) {
                Notification notification = new Notification();
                notification.setNotificationId(UUID.randomUUID().toString());
                notification.setCreatedAt(new Date());
                notification.setMessage("Message...");
                notification.setSeen(false);
                producer.sendToQueue(notification);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("Notification sender");
        thread.start();
    }


    @PostConstruct
    public void init() {
        getThread();

    }
}

