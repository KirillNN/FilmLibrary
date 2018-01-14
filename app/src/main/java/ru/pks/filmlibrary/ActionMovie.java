package ru.pks.filmlibrary;

public class ActionMovie {
    private String name;
    private String description;

    static final ActionMovie[] amove = {
            new ActionMovie("Фильм_1", "Описание_1 dogjdlghdfhgldhflghjdfhjgldf fdjgldfjghldfsjhl;dsfjhlj fdsjhlksfdjhlksdjfhlsfdjhlkjsdf jhsdfjhlk;sfdjhl;sdfjh"),
            new ActionMovie("Фильм_2", "Описание_2 dfopighjdsfihj ljf;oo;;'hgjkigfoo;hgkjgh;jkgjkghjk khgjkghkjlkghkjghjk ghljkgfljkghjkfgljkghkjlg ghljfgjklfgl"),
            new ActionMovie("Фильм_3", "Описание_3"),
            new ActionMovie("Фильм_4", "Описание_4"),
            new ActionMovie("Фильм_5", "Описание_5"),
            new ActionMovie("Фильм_6", "Описание_6"),
            new ActionMovie("Фильм_7", "Описание_7"),
            new ActionMovie("Фильм_8", "Описание_8"),
            new ActionMovie("Фильм_9", "Описание_9"),
            new ActionMovie("Фильм_10", "Описание_10"),
            new ActionMovie("Фильм_11", "Описание_11"),
            new ActionMovie("Фильм_12", "Описание_12"),
            new ActionMovie("Фильм_13", "Описание_13"),
            new ActionMovie("Фильм_14", "Описание_14"),
            new ActionMovie("Фильм_15", "Описание_15"),
            new ActionMovie("Фильм_16", "Описание_16"),
    };

    private ActionMovie(String name, String description) {
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
