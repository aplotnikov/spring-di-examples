package org.home.spring.aop.xml.param;

import java.util.HashMap;
import java.util.Map;

public class ParamAudience {
    public static final Map<Integer, Integer> TRACK_COUNT = new HashMap<>();

    public void countTrack(int trackNumber) {
        int previousAmount = TRACK_COUNT.getOrDefault(trackNumber, 0);
        TRACK_COUNT.put(trackNumber, previousAmount + 1);
    }
}
