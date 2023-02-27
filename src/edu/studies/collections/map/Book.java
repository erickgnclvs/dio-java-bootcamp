package edu.studies.collections.map;

import java.util.Objects;

public class Book {
    private String name;
    private Integer numOfPages;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(numOfPages, book.numOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfPages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(Integer numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Book(String name, Integer numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    public Book() {
    }
}
