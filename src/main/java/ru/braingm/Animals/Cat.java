package ru.braingm.Animals;

import lombok.Getter;

public class Cat extends Animal {
    @Getter
    private static int count = 0;

    public Cat(String name) {
        super(name);
        this.runDistance = 200;
        this.swimDistance = 0;
        count++;
    }
}
