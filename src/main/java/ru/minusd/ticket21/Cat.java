package ru.minusd.ticket21;

import java.util.Objects;

public class Cat implements Searchable {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equalTo(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }
}
