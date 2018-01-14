package ru.pks.filmlibrary;

public class Genre {

    static final Genre[] genres = {
            new Genre("Боевик"),
            new Genre("Вестерн"),
            new Genre("Детектив"),
            new Genre("Детское кино"),
            new Genre("Документальное кино"),
            new Genre("Драма"),
            new Genre("Комедия"),
            new Genre("Приключение"),
            new Genre("Семейное кино"),
            new Genre("Триллер"),
            new Genre("Ужасы"),
            new Genre("Фантастика")
    };
    private String name;

    private Genre(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
