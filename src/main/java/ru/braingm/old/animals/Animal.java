package ru.braingm.old.animals;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public abstract class Animal {
    protected String name;
    protected int swimDistance;
    protected int runDistance;
    @Getter
    private static int count = 0;
    @Getter
    private static ArrayList<Animal> animals = new ArrayList<>();

    protected Animal(String name) {
        this.name = name;
        animals.add(this);
        count++;
    }

    public boolean swim(int distance) {
        return this.swimDistance >= distance;
    }

    public boolean run(int distance) {
        return this.runDistance >= distance;
    }
}
