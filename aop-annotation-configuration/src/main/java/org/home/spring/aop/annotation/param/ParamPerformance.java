package org.home.spring.aop.annotation.param;

import org.springframework.stereotype.Component;

@Component
public class ParamPerformance {
    public void playTrack(int trackNumber) {
        System.out.println("Perform track id " + trackNumber);
    }
}
