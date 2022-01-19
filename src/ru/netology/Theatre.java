package ru.netology;

public class Theatre extends Event {

    public Theatre(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Theatre { " +
                "title = '" + title + '\'' +
                ", releaseYear = " + releaseYear +
                ", age = " + age +
                " }";
    }
}
