package net.flix;

public class Movie {
    //fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // Constructors
    // 1 arg constructor
    public Movie(String title) {
        setTitle(title);
    }
    // 2 arg ctor
    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }
    // 5 arg ctor
    public Movie(String title, Genre genre, Integer releaseYear, Double revenue, Rating rating) {
        this(title,genre);                     // delegate to neighboring ctor above me for title and genre
        setReleaseYear(releaseYear);           // handle releaseYear myself, by delegating to its setter
        setRevenue(revenue);                   // handle revenue myself, by delegating to its setter
        setRating(rating);                     // handle rating myself, by delegating to its setter

    }

    // business oriented methods - deliberately omitted
    // play() pause() stop() rewind() fast forward()

    //accessor methods (get/set methods)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toString()
    public String toString() {
        return String.format("Movie: Title=%s, Release Year=%s, Revenue=%,.4f, Rating=%s, Genre=%s"
                                    ,getTitle(),getReleaseYear(),getRevenue(),getRating(),getGenre());
//        return "Movie: Title=" + getTitle() + ", Release Year=" + getReleaseYear()
//                + ", Revenue=" + getRevenue() + ", Rating=" + getRating()
//                + ", Genre=" + getGenre();
    }
}