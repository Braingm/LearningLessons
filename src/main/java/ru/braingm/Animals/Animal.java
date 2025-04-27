package ru.braingm.Animals;

import lombok.Getter;

@Getter
public abstract class Animal {
    protected String name;
    protected int swimDistance;
    protected int runDistance;
    @Getter
    private static int count = 0;

    protected Animal(String name){
        this.name = name;
        count++;
    }

    public boolean swim(int distance){
        return this.swimDistance >= distance;
    }

    public boolean run(int distance){
        return this.runDistance >= distance;
    }
}
