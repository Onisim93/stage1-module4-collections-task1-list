package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int firstFunction = calculationFunc(first);
        int secondFunction = calculationFunc(second);
        if (firstFunction == secondFunction) {
            return Integer.compare(first, second);
        }
        return Integer.compare(firstFunction, secondFunction);
    }

    private int calculationFunc(int x) {
        return (int) (5 * Math.pow(x, 2) + 3);
    }
}

