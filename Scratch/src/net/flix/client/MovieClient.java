package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Shrek", Genre.COMEDY,2005,491_800_000.03, Rating.PG);
        System.out.println(movie1 + "\n");  // toString() automatically called

        Movie movie2 = new Movie("The Labyrinth",Genre.ACTION,1986, 20.00, Rating.PG);
        System.out.println(movie2 + "\n");

        Movie movie3 = new Movie("Vacation in Java", Genre.HORROR);
        System.out.println(movie3);
    }
}