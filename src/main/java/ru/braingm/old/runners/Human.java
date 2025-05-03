package ru.braingm.old.runners;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human implements Actionable {
    private final String name;
    private final int runDistance;
    private final int jumpDistance;


    @Override
    public boolean run(int distance) {
        return runDistance >= distance;
    }

    @Override
    public boolean jump(int distance) {
        return jumpDistance >= distance;
    }

    public void doHumanStuff() {
        System.out.println(name + " doing human stuff");
    }

    @Override
    public String toString() {
        return name;
    }
}
