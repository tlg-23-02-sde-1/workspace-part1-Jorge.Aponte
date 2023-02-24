package edu.book;

public enum Genre {
    ADVENTURE("Adventure"),
    FANTASY("Fantasy"),
    MYSTERY("Mystery"),
    NON_FICTION("Non-Fiction"),
    CLASSICS("Classics"),
    CRIME("Crime"),
    FAIRY_TALE("Fairy Tale"),
    ROMANCE("Romance"),
    SCIENCE_FICTION("Science Fiction"),
    THRILLER("Thriller"),
    OTHER("Other");

    private String display;

    Genre(String display) {
        this.display = display;
    }

    public String display() {
        return display;
    }

    public String toString() {
        return display();
    }
}