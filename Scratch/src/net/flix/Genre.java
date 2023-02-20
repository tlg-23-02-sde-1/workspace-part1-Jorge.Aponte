package net.flix;

public enum Genre {
    COMEDY("Comedy"),
    WESTERN("Western"),
    MYSTERY("Mystery"),
    SCI_FI("Science Fiction"),
    ACTION("Action"),
    DRAMA("Drama"),
    ROMANCE("Romance"),
    HORROR("Horror");

    // ----------------------------
    // everything under this line is regular class definition stuff
    // namely, fields, constructors, methods
    // ----------------------------

    private String display;     // no need to place "final" on display since there is no setters.

    // constructor - called only from inside (8 times, from those listed above)
    Genre (String display) {
        this.display = display;
        // System.out.println("Genre ctor called: "); // Shows that when ctor is called it's called for all instances
    }

    public String display() {    // often the "get" prefix is omitted when there is no setter
        return display;
    }

    public String toString() {
        return display;
    }
}