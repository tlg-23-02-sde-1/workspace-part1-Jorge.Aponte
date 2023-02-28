package edu.book.test;

import edu.book.Book;

/*
 * JR: good job overall.
 * Better would be to test right on the boundaries:
 *  - if totalNumOfPages is 100, try these values for currentPageNum
 *    0, 1 for MIN_PAGES
 *    100, 101 for "currentPageNum cannot be greater than totalNumOfPages" rule
 */
class BookValidationTest {

    public static void main(String[] args) {
        System.out.println("Total number of books created: " + Book.getBookCreationCounter());// indicate 0 books

        Book book = new Book("Area 51");

        System.out.println(book + "\n");

        book.setTotalNumOfPages(250);                       // should stick
        book.setCurrentPageNum(200);                        // should stick
        System.out.println("Current Page = " + book.getCurrentPageNum() + ", Total # of Pages = "
                + book.getTotalNumOfPages() + "\n");        // should print set values above

        book.setTotalNumOfPages(2500);                      // should stick
        book.setCurrentPageNum(2500);                       // should stick
        System.out.println("Current Page = " + book.getCurrentPageNum() + ", Total # of Pages = "
                + book.getTotalNumOfPages() + "\n");        // should print set values above

        book.setTotalNumOfPages(-200);                      // should get an error
        book.setCurrentPageNum(3000);                       // should get an error
        System.out.println("Current Page = " + book.getCurrentPageNum() + ", Total # of Pages = "
                + book.getTotalNumOfPages() + "\n");        // should not print set value above

        book.setTotalNumOfPages(500);                       // should get an error
        book.setCurrentPageNum(-250);                       // should get an error
        System.out.println("Current Page = " + book.getCurrentPageNum() + ", Total # of Pages = "
                + book.getTotalNumOfPages() + "\n");        // should not print set values above

        book.setTotalNumOfPages(-500);                      // should get an error
        book.setCurrentPageNum(250);                        // should stick
        System.out.println("Current Page = " + book.getCurrentPageNum() + ", Total # of Pages = "
                + book.getTotalNumOfPages() + "\n");        // should print new Current Page

        Book book2 = new Book("Three Little Pigs");    // created for creation counter

        System.out.println("Total number of books created: " + Book.getBookCreationCounter()); // indicate 2 book
    }
}