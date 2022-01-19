package ru.netology;

public class Movie extends Event {

    public Movie(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Movie { " +
                "title = '" + title + '\'' +
                ", releaseYear = " + releaseYear +
                ", age = " + age +
                " }";
    }
}
