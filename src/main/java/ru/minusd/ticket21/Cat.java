package ru.minusd.ticket21;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Cat o) {
        return name.compareTo(o.name);
    }
}
