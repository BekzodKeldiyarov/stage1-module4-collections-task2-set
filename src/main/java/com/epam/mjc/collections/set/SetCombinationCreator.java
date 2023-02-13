package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> strings = new HashSet<>();
        Iterator<String> iterator = firstSet.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (secondSet.contains(value) && !thirdSet.contains(value)) {
                strings.add(value);
            }
        }
        iterator = thirdSet.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (!firstSet.contains(value) && !secondSet.contains(value)) {
                strings.add(value);
            }
        }
        return strings;
    }
}
