package ru.braingm.les3;

import ru.braingm.les3.Fruits.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> box = new ArrayList<>();

    public void put(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        if (!this.box.isEmpty())
            return this.box.size() * this.box.getFirst().getWeight();
        return 0.0f;
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void moveTo(Box<T> anotherBox) {
        this.box.forEach(anotherBox::put);
        this.box.clear();
    }
}

