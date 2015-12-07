package org.home.spring.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class AroundPerformance {
    public void perform() {
        System.out.println("Performance");
    }
}
