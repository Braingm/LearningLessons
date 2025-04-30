package ru.braingm;

import ru.braingm.animals.Animal;
import ru.braingm.animals.Dog;
import ru.braingm.animals.HomeCat;
import ru.braingm.animals.Tiger;
import ru.braingm.runners.*;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        animalsDoings();
        runnersDoings();


    }

    private static void runnersDoings() {
        ArrayList<Actionable> runners = new ArrayList<>();
        runners.add(new Human("Pasha", 10000, 2));
        runners.add(new Human("Druna", 12000, 1));
        runners.add(new Human("Artyom", 16000, 3));
        runners.add(new Cat("Boosinka", 1000, 5));
        runners.add(new Cat("Koshates", 1300, 7));
        runners.add(new Cat("Peach", 800, 3));
        runners.add(new Robot("NAG1BAT0R", 1200000, 100));
        runners.add(new Robot("MKS", 100, 800000));
        runners.add(new Robot("G1AD0S", 900000, 10000));

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(1000, ObstacleType.Treadmill));
        obstacles.add(new Obstacle(2, ObstacleType.Wall));
        obstacles.add(new Obstacle(10000, ObstacleType.Treadmill));
        obstacles.add(new Obstacle(10, ObstacleType.Wall));
        obstacles.add(new Obstacle(10000, ObstacleType.Treadmill));

        for (Actionable runner : runners) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getType().equals(ObstacleType.Treadmill)) {
                    if (runner.run(obstacle.getObstacleSize()))
                        System.out.println(runner + " пробежал " + obstacle.getObstacleSize());
                    else {
                        System.out.println(runner + " не справился и выбыл");
                        break;
                    }
                }
                if (obstacle.getType().equals(ObstacleType.Wall)) {
                    if (runner.jump(obstacle.getObstacleSize()))
                        System.out.println(runner + "перепрыгнул " + obstacle.getObstacleSize());
                    else {
                        System.out.println(runner + "не справился и выбыл");
                        break;
                    }
                }

            }
        }
    }

    private static void animalsDoings() {
        HomeCat homeCat1 = new HomeCat("Barsik");
        HomeCat homeCat2 = new HomeCat("Louna");
        Dog dog1 = new Dog("Tina");
        Dog dog2 = new Dog("Izabella");
        Tiger tiger = new Tiger("Simba");

        System.out.println("Animal count: " + Animal.getCount());
        System.out.println("Cat count: " + HomeCat.getCount());
        System.out.println("Dog count: " + Dog.getCount());
        System.out.println("Tiger count: " + Tiger.getCount());

        for (Animal animal : Animal.getAnimals()) {
            toSwim(animal, 12);
            toRun(animal, 500);
        }
    }

    private static void toSwim(Animal animal, int distance) {
        if (animal.swim(distance))
            System.out.println(animal.getName() + " доплыл");
        else
            System.out.println(animal.getName() + " не доплыл");
    }

    private static void toRun(Animal animal, int distance) {
        if (animal.run(distance))
            System.out.println(animal.getName() + " добежал");
        else
            System.out.println(animal.getName() + " не добежал");
    }
}

