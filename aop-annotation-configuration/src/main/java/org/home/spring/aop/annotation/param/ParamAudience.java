package org.home.spring.aop.annotation.param;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class ParamAudience {
    public static final Map<Integer, Integer> TRACK_COUNT = new HashMap<>();

    @Pointcut("execution(* ParamPerformance.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before(value = "trackPlayed(trackNumber)", argNames = "trackNumber")
    public void countTrack(int trackNumber) {
        int previousAmount = TRACK_COUNT.getOrDefault(trackNumber, 0);
        TRACK_COUNT.put(trackNumber, previousAmount + 1);
    }
}
