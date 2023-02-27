package edu.studies.collections.list;

public class ComparatorColor implements java.util.Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }
}
