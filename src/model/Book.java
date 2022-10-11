package model;

import java.util.StringJoiner;

public class Book extends Entity {
    private int numberOfPages;
    private String title;

    public Book(int numberOfPages, String title) {
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("numberOfPages=" + numberOfPages)
                .add("title='" + title + "'")
                .add("weight=" + weight)
                .toString();
    }
}
