package ru.pks.filmlibrary;

public class Genre {

    private String name;
    private String description;

    static final Genre[] genres = {
            new Genre("Боевик", "Боевики"),
            new Genre("Вестерн", "Вестерны"),
            new Genre("Детектив", "Детективы"),
            new Genre("Детское кино", "Детское кино"),
            new Genre("Документальное кино", "Документальное кино"),
            new Genre("Драма", "Драмы"),
            new Genre("Комедия", "Комедии"),
            new Genre("Приключение", "Приключения"),
            new Genre("Семейное кино", "Семейное кино"),
            new Genre("Триллер", "Триллеры"),
            new Genre("Ужасы", "Ужасы"),
            new Genre("Фантастика", "Фантастика")
    };

    private Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
