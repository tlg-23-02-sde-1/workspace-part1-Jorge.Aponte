package edu.book.client;

import edu.book.Book;
import static edu.book.Genre.*;

class BookClient {

    public static void main(String[] args) {
        // ctor avail 1,3,6 arg
        Book b1 = new Book("Head First Java", "Kathy Sierra",
                true, 1629, 1, NON_FICTION);
        Book b2 = new Book("Artemis Fowl", "Eoin Colfer", false);
        Book b3 = new Book("Jungle Book");

        // Book creator counter
        System.out.println("Total number of created books: " + Book.getBookCreationCounter());

        // method to allow input for user options (just change object reference to coincide book object)
        b1.choiceOption();      // toString is option "5"
    }
}
