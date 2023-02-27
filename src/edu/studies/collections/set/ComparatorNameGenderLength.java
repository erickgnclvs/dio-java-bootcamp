package edu.studies.collections.set;

import java.util.Comparator;

public class ComparatorNameGenderLength implements Comparator<Series> {
    public ComparatorNameGenderLength() {
    }

    @Override
    public int compare(Series o1, Series o2) {
        int gender = o1.getGender().compareTo(o2.getGender());
        int name = o1.getName().compareToIgnoreCase(o2.getName());
        int length = o1.getEpisodeLength().compareTo(o2.getEpisodeLength());

        if (length != 0) return length;
        if (name != 0) return name;
        else return gender;
    }
}
