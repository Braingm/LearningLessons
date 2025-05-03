package ru.braingm.old.runners;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Robot implements Actionable {
    @Getter
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

    public void doRobotStuff() {
        System.out.println(name + " doing robot stuff");
    }

    @Override
    public String toString() {
        return name;
    }
}
