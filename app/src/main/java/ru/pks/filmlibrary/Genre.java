package ru.pks.filmlibrary;

public class Genre {

    static final Genre[] genres = {
            new Genre("Боевик", ""),
            new Genre("Вестерн", ""),
            new Genre("Детектив", ""),
            new Genre("Детское кино", ""),
            new Genre("Документальное кино", ""),
            new Genre("Драма", ""),
            new Genre("Комедия",""),
            new Genre("Приключение",""),
            new Genre("Семейное кино",""),
            new Genre("Триллер",""),
            new Genre("Ужасы",""),
            new Genre("Фантастика","")
    };

    private String name;
    private String description;

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
