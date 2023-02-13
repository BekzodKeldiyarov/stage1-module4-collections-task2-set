package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> integers = new HashSet<>();
        for (Integer i : sourceList) {
            integers.add(i * i);
        }
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        Iterator<Integer> iterator= integers.iterator();
        while(iterator.hasNext()){
            int value = iterator.next();
            if(value>=lowerBound & value<=upperBound){
                navigableSet.add(value);
            }
        }
        return navigableSet;
    }

    public static void main(String[] args) {
        SubsetOfSquaresCreator creator = new SubsetOfSquaresCreator();
        System.out.println(creator.createSubsetOfSquares(List.of(2, -1, 5, -7, 4, 6, -9, 8), 25, 49));
    }
}
