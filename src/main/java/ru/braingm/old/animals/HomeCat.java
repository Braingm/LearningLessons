package ru.braingm.old.animals;

import lombok.Getter;

public class HomeCat extends Animal {
    @Getter
    private static int count = 0;

    public HomeCat(String name) {
        super(name);
        this.runDistance = 200;
        this.swimDistance = 0;
        count++;
    }
}
