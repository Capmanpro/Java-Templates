package com.novikov.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class CoolAspect {
    @Before("within(com.novikov.service.*)")
    public void BeforeLoggingAdvice(JoinPoint joinPoint){
        log.info("Pameters: {}", joinPoint.getArgs());
    }
}
