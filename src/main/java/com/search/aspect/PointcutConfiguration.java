package com.search.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointcutConfiguration {

    @Pointcut("execution(public * com.search.facade.*Facade.*(..))")
    void searchCalls() { /* Pointcut */ }

    @Pointcut("execution(public * com.search.controller.*.*(..))")
    void controllerEndpoints() { /* Pointcut */ }
}
