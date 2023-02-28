package edu.book.client;

import edu.book.Book;
import static edu.book.Genre.*;

/*
 * JR: nice job.
 * I created a Book 'b4' below, for easier testing of your business rules.
 */
class BookClient {

    public static void main(String[] args) {
        // ctor avail 1,3,6 arg
        Book b1 = new Book("Head First Java", "Kathy Sierra", true, 1629, 1, NON_FICTION);
        Book b2 = new Book("Artemis Fowl", "Eoin Colfer", false);
        Book b3 = new Book("Jungle Book");

        // Book creator counter
        System.out.println("Total number of created books: " + Book.getBookCreationCounter());

        // JR: fewer total pages to test the turning-past-the-end behavior
        // Looks like it works correctly
        Book b4 = new Book("Core Java", "Jay Rostosky", false, 10, 1, NON_FICTION);
        b4.choiceOption();

        // method to allow input for user options (just change object reference to coincide book object)
        // b1.choiceOption();      // toString is option "5"
    }
}
