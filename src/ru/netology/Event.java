package ru.netology;

public abstract class Event {
    String title;
    int releaseYear, age;

    @Override
    public String toString() {
        return "title = [" + title + "], releaseYear = [" + releaseYear + "], age = [" + age + "]";
    }
}
