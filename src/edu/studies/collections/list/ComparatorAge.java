package edu.studies.collections.list;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
