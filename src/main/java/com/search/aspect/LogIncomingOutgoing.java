package com.search.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogIncomingOutgoing {
    private static final String MESSAGE_FAILED_TO_SERIALIZE = "Failed to serialize!";
    private static Logger logger = LoggerFactory.getLogger(LogIncomingOutgoing.class);
    private ObjectMapper om;

    public LogIncomingOutgoing(ObjectMapper om) {
        this.om = om;
    }

    @Before("com.search.aspect.PointcutConfiguration.controllerEndpoints()")
    public void afterFacadeCall(JoinPoint joinPoint) {
        if (logger.isTraceEnabled()) {
            logger.trace("Controller method '{}' was called with input {} ", joinPoint.getSignature(), serialize(joinPoint.getArgs()));
        }
    }

    @AfterReturning(pointcut = "com.search.aspect.PointcutConfiguration.searchCalls()", returning = "returnValue")
    public void afterFacadeCall(Object returnValue) {
        if (logger.isTraceEnabled()) {
            logger.trace("Facade received response from FACT-Finder: {} ", serialize(returnValue));
        }
    }

    @AfterReturning(pointcut = "com.search.aspect.PointcutConfiguration.controllerEndpoints()", returning = "returnValue")
    public void afterControllerCall(JoinPoint joinPoint, Object returnValue) {
        if (logger.isTraceEnabled()) {
            logger.trace("Controller method '{}' returns: {} ", joinPoint.getSignature(), serialize(returnValue));
        }
    }

    private String serialize(Object obj) {
        try {
            return om.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.warn(MESSAGE_FAILED_TO_SERIALIZE, e);
            return null;
        }
    }
}