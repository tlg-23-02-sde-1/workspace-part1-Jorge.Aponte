package edu.book.client;

import edu.book.Book;
import edu.book.Genres;

import java.util.Arrays;

class BookClientArgs {
    public static void main(String[] args) {
        if (args.length < 6) {
            String usage = "Usage: java BookClientArgs <title> <authorName> <isOpen> <totalNumOfPages>" +
                    " <currentPageNum> <genre>";
            String example = "Example: java BookClientArgs \"The Jungle Book\" \"Rudyard Kipling\" " +
                    "false 368 250 ADVENTURE";
            String note1 = "Total Number of Pages must be greater than " + Book.MIN_PAGES +
                    " and less than or equal to the Current Page";
            String note2 = "Supported Genres are " + Arrays.toString(Genres.values());
            String note3 = "Current Page must be greater than " + Book.MIN_PAGES + " and less than " +
                    "or equal to the Total Number of Pages";
            System.out.println(usage + "\n" + example + "\n" + note1 + "\n" + note2 + "\n" + note3);
            return;
        }

        System.out.println("You provided " + args.length + " arguments");

        String title = args[0];
        String author = args[1];
        boolean isOpen = Boolean.parseBoolean(args[2]);
        int totalNumOfPages = Integer.parseInt(args[3]);
        int currentPage = Integer.parseInt(args[4]);
        Genres genre = Genres.valueOf(args[5].toUpperCase());

        Book book = new Book(title, author, isOpen, totalNumOfPages, currentPage, genre);

        System.out.println("Congratulations on ordering your Book!");
        System.out.println("Your custom book is on the way!");
        System.out.println(book);
    }
}