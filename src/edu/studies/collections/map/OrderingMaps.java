package edu.studies.collections.map;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class OrderingMaps {
    public static void main(String[] args) {

        Map<String, Book> myBooks = new HashMap<>();
        myBooks.put("author 1", new Book("book 1", 356));
        myBooks.put("author 2", new Book("book 2", 214));
        myBooks.put("author 3", new Book("book 3", 422));
        System.out.println(myBooks);

        for (Book value : myBooks.values()) {
            System.out.println(value);
        }

        for (String s : myBooks.keySet()) {
            System.out.println(s);
        }

        for (Map.Entry<String, Book> stringBookEntry : myBooks.entrySet()) {
            System.out.println(stringBookEntry.getKey() + " " + stringBookEntry.getValue().getName());
        }

        Map<String, Book> myBooksTwo = new TreeMap<>(myBooks);
        System.out.println(myBooksTwo);
    }
}
