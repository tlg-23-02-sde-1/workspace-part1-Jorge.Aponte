package edu.book;

import java.util.Scanner;

public class Book {

    public static final int MIN_PAGES = 1;

    private static int bookCreationCounter = 0;

    public static int getBookCreationCounter() {
        return bookCreationCounter;
    }

    private String title;
    private String authorName;
    private Integer totalNumOfPages;
    private Integer currentPageNum = MIN_PAGES;
    private Boolean isOpen = false;
    private Genre genre;

    Scanner in = new Scanner(System.in);

    public Book(String title) {
        setTitle(title);
        bookCreationCounter++;
    }

    public Book(String title, String authorName, Boolean isOpen) {
        this(title);
        setAuthorName(authorName);
        setOpen(isOpen);
    }

    public Book(String title, String authorName, Boolean isOpen,
                Integer totalNumOfPages, Integer currentPageNum, Genre genre) {
        this(title, authorName, isOpen);
        setTotalNumOfPages(totalNumOfPages);
        setCurrentPageNum(currentPageNum);
        setGenre(genre);
    }

    private void openBook() {
        if (!isOpen()) {
            System.out.println(getAuthorName() + "'s " + getTitle() + " is open and ready to read!");
            setOpen(true);
        } else {
            System.out.println("Book is already opened.");
        }
    }

    private void closeBook() {
        if (isOpen()) {
            System.out.println(getAuthorName() + "'s " + getTitle() + " is closed for reading.");
            setOpen(false);
        } else {
            System.out.println("Book is already closed.");
        }
    }

    private void turnNextPage() {
        if (getCurrentPageNum() < getTotalNumOfPages() && isOpen()) {
            currentPageNum++;
            System.out.println("Turning to page " + getCurrentPageNum());
        } else if (!isOpen()) {
            System.out.println("Book must be open to turn page. Try Again!");
        } else {
            System.out.println("You can not go past page: " + getTotalNumOfPages() + ". Try Again!");
        }
    }

    private void turnPreviousPage() {
        if (getCurrentPageNum() > MIN_PAGES && isOpen()) {
            currentPageNum--;
            System.out.println("Turning to page " + getCurrentPageNum());
        } else if (!isOpen()) {
            System.out.println("Book must be open to turn page. Try Again!");
        } else {
            System.out.println("You can not go beyond page: " + MIN_PAGES + ". Try Again!");
        }
    }

    private void menuOptions() {
        System.out.println("\nHere are some options to choose from:\n");
        System.out.println("Press 1 to Open your Book");
        System.out.println("Press 2 to Turn to the Next Page");
        System.out.println("Press 3 to Turn to the Previous Page");
        System.out.println("Press 4 to Close your Book");
        System.out.println("Press 5 for Book Info");
        System.out.println("Press 6 to Exit\n");
        System.out.print("What action would you like to take: ");
    }

    public void choiceOption() {
        String optionChoice;                        // allow for character input for validation

        do {
            menuOptions();
            optionChoice = String.valueOf(in.next());

            switch (optionChoice) {

                case "1":
                    openBook();
                    break;

                case "2":
                    if (getTotalNumOfPages() != null) {
                        turnNextPage();
                    } else {
                        System.out.println("Invalid Input: Can not turn page while Total # pages= "
                                + getTotalNumOfPages());
                    }
                    break;

                case "3":
                    if (getTotalNumOfPages() != null) {
                        turnPreviousPage();
                    } else {
                        System.out.println("Invalid Input: Can not turn page while Total # pages= "
                                + getTotalNumOfPages());
                    }
                    break;

                case "4":
                    closeBook();
                    break;

                case "5":
                    System.out.println(this);
                    break;

                case "6":
                    System.out.println();
                    break;

                default:
                    System.out.println("\nIncorrect Input: " + optionChoice +
                            ", Input must be one of the choices listed above.");
            }
        } while (!optionChoice.equals("6"));
    }

    public Integer getTotalNumOfPages() {
        return totalNumOfPages;
    }

    public void setTotalNumOfPages(Integer totalNumOfPages) {
        if (totalNumOfPages >= getCurrentPageNum() && totalNumOfPages >= MIN_PAGES) {
            this.totalNumOfPages = totalNumOfPages;
        } else if (totalNumOfPages < MIN_PAGES) {
            System.out.println("Invalid Input: " + totalNumOfPages +
                    ", Total number of Pages must be greater than " + MIN_PAGES);
        } else {
            System.out.println("Invalid Input: " + totalNumOfPages +
                    ", Total number of Pages can not be less than the current page: " + getCurrentPageNum());
        }
    }

    public Integer getCurrentPageNum() {
        return currentPageNum;
    }

    public void setCurrentPageNum(Integer currentPageNum) {
        if (currentPageNum >= MIN_PAGES && currentPageNum <= getTotalNumOfPages()) {
            this.currentPageNum = currentPageNum;
        } else if (currentPageNum < MIN_PAGES) {
            System.out.println("Invalid Input: " + currentPageNum +
                    ", Current page must be greater than " + MIN_PAGES);
        } else {
            System.out.println("Invalid Input: " + currentPageNum +
                    ", Current page must be less than the Total # of pages: " + getTotalNumOfPages());
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean isOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Book: Title=" + getTitle() + " , Author=" + getAuthorName() + " , Genre=" +
                getGenre() + " ,Total # of Pages=" + getTotalNumOfPages() + " , Current Page#="
                + getCurrentPageNum() + " , The Book is Open:" + isOpen();
    }
}