package ru.braingm.Animals;

import lombok.Getter;

public class Dog extends Animal{
    @Getter
    private static int count = 0;

    public Dog(String name) {
        super(name);
        this.runDistance = 500;
        this.swimDistance = 10;
        count++;
    }
}
