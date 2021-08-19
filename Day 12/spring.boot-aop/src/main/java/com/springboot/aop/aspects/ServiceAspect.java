package com.springboot.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.springboot.aop.service.MessageService.sendMessage(..))")
    public void BeforeMessageSend(JoinPoint joinPoint) {
        System.out.println("Before Message Send: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.springboot.aop.service.*.save(..))")
    public void AfterMessageSend(JoinPoint  joinPoint) {
        System.out.println("After Message Send: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

}
