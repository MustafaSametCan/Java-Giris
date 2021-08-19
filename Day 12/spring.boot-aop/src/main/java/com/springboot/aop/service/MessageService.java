package com.springboot.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String sendMessage(String param) {
        System.out.println("Methods message: " + param);
        return param;
    }
}
