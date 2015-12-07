package org.home.spring.aop.xml.around;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAudience {
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");

            jp.proceed();

            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
