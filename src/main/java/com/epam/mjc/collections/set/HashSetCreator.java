package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integers = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 != 0) {
                integers.add(i);
                integers.add(2 * i);
            } else {
                while (i % 2 == 0) {
                    integers.add(i);
                    i = i / 2;
                }
                integers.add(i);
            }
        }
        return integers;
    }
}
