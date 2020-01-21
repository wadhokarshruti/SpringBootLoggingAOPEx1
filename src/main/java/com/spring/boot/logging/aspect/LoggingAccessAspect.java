package com.spring.boot.logging.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAccessAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAccessAspect.class);

    @Before("execution(* com.spring.boot.logging.other.*.*(..))")
    public void before(JoinPoint joinPoint){
        //Advice before every method call
        logger.info("Before method execution");
        logger.info("Allowed execution for {}", joinPoint);
    }
}
