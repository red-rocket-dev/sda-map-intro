package pl.sda;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Song {
    private String author;
    private String title;
    private String lyrics;

    public static final List<String> BAD_AUTHORS;


    //public static final List<String> BAD_AUTHORS = List.of("Ich troje", "Dohtor miud", "Syntetic");


    public Song(String author, String title, String lyrics) {
        System.out.println("Jestem konstruktorem!");
        this.author = author;
        this.title = title;
        this.lyrics = lyrics;
    }

    static {
        //TODO: po co, listy
        List<String> authors = new LinkedList<>();
        authors.add("Ich troje");
        authors.add("Dohtor miud");
        authors.add("Syntetic");
        BAD_AUTHORS = Collections.unmodifiableList(authors);
        System.out.println("Jestem blokiem statycznym!");
    }

    {
        System.out.println("Jestem blokiem niestatycznym!");
    }
}
