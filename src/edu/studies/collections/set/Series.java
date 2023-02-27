package edu.studies.collections.set;

import java.util.Comparator;
import java.util.Objects;

public class Series implements Comparable<Series> {
    private String name;
    private String gender;
    private Integer episodeLength;

    public Series() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(name, series.name) && Objects.equals(gender, series.gender) && Objects.equals(episodeLength, series.episodeLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, episodeLength);
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", episodeLength=" + episodeLength +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEpisodeLength() {
        return episodeLength;
    }

    public void setEpisodeLength(Integer episodeLength) {
        this.episodeLength = episodeLength;
    }

    public Series(String name, String gender, Integer episodeLength) {
        this.name = name;
        this.gender = gender;
        this.episodeLength = episodeLength;
    }

    @Override
    public int compareTo(Series o) {
        int gender = this.getGender().compareTo(o.getGender());
//        return Integer.compare(this.episodeLength, o.episodeLength);
        int length = this.episodeLength.compareTo(o.episodeLength);

        if (length != 0) return length;
        else return gender;
    }
}
