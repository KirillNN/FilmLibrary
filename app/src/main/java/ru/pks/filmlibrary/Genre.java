package ru.pks.filmlibrary;

public class Genre {

    private String name;
    private String description;

    static final Genre[] genres = {
            new Genre("Боевик", "Боевик"),
            new Genre("Вестерн", "Вестерн"),
            new Genre("Детектив", "Детектив"),
            new Genre("Детское кино", "Детское кино"),
            new Genre("Документальное кино", "Документальное кино"),
            new Genre("Драма", "Драма"),
            new Genre("Комедия", "Комедия"),
            new Genre("Приключение", "Приключение"),
            new Genre("Семейное кино", "Семейное кино"),
            new Genre("Триллер", "Триллер"),
            new Genre("Ужасы", "Ужасы"),
            new Genre("Фантастика", "Фантастика")
    };

    private Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
