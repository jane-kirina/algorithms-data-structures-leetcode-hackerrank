package com.company.hackerrank.algorithm.implementation.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static int sockMerchantBetter(int n, List<Integer> ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        int count = 0;

        for (Integer socksId : ar) {
            if (socks.containsKey(socksId)) {
                socks.remove(socksId);
                count++;
            } else {
                socks.put(socksId, 1);
            }
        }

        return count;
    }

    public static int sockMerchantUsingTwoLoops(int n, List<Integer> ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        int count = 0;

        for (Integer socksId : ar) {
            if (!socks.containsKey(socksId)) {
                socks.put(socksId, 1);
            } else {
                socks.put(socksId, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            if(entry.getValue() % 2 == 0) {
                count += entry.getValue() / 2;
            } else {
                count += (entry.getValue() - 1) / 2;
            }
        }
        return count;
    }
}
