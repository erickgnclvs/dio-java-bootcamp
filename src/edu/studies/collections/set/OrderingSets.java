package edu.studies.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrderingSets {
    public static void main(String[] args) {

        Set<Series> mySeries = new HashSet<>();
        mySeries.add(new Series("got", "fantasy", 60));
        mySeries.add(new Series("dark", "drama", 60));
        mySeries.add(new Series("that '70s show", "comedy", 25));

        System.out.println(mySeries);

        for (Series s : mySeries) {
            System.out.print(s.getName() + " ");
            System.out.print(s.getEpisodeLength() + " ");
            System.out.print(s.getGender() + "\n");
        }

        Set<Series> mySeriesTwo = new TreeSet<>(mySeries);
        System.out.println(mySeriesTwo);

        Set<Series> mySeriesThree = new TreeSet<>(new ComparatorNameGenderLength());
        System.out.println(mySeriesThree);

        mySeriesThree.addAll(mySeriesTwo);
        System.out.println(mySeriesThree);

    }
}
