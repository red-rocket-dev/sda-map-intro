package pl.sda;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Ich troje", "Powiedz", "Powiedz, powiedz czemu");
        Song song2 = new Song("Ich troje", "Powiedz", "Powiedz, powiedz czemu");


        //Song.BAD_AUTHORS = new LinkedList<>();
        Song.BAD_AUTHORS.add("test");


        System.out.println(Song.BAD_AUTHORS);
    }
}
