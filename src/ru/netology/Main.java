package ru.netology;

public class Main {

    public static void main(String[] args) throws RuntimeException {

        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    private static void validEvent(Event event) throws RuntimeException {
        if(event.title == null || event.releaseYear == 0 || event.age == 0) {
            throw new RuntimeException("Error in object field, 'null' or '0' ! \n" + event.toString());
        }
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("За пригоршню долларов", 1964, 18),
                new Movie("На несколько долларов больше", 1965, 18),
                new Movie("Хороший, плохой, злой", 1966, 18)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Иисус Христос — суперзвезда", 1971, 16),
                new Theatre("Юнона и Авось", 1980, 16),
                new Theatre("Эльфийская рукопись", 2004, 16),
                new Theatre("TODD", 2012, 16),
        };
    }
}
