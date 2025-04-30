package ru.braingm.animals;

import lombok.Getter;

public class Tiger extends Animal {
    @Getter
    private static int count = 0;

    public Tiger(String name) {
        super(name);
        this.runDistance = 1000;
        this.swimDistance = 50;
        count++;
    }
}
