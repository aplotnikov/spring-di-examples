package org.home.spring.aop.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Performance {
    public void perform() {
        System.out.println("Performance");
    }
}
