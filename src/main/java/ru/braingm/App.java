package ru.braingm;

import ru.braingm.Animals.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Louna");
        Dog dog1 = new Dog("Tina");
        Dog dog2 = new Dog("Izabella");
        Tiger tiger = new Tiger("Simba");

        System.out.println("Animal count: " + Animal.getCount());
        System.out.println("Cat count: " + Cat.getCount());
        System.out.println("Dog count: " + Dog.getCount());
        System.out.println("Tiger count: " + Tiger.getCount());

        toSwim(cat2,10);
        toRun(cat1, 50);
        toSwim(dog2, 5);
        toRun(dog1, 300);
        toSwim(tiger, 90);
        toRun(tiger, 900);

    }

    private static void toSwim(Animal animal, int distance){
        if (animal.swim(distance))
            System.out.println(animal.getName() + " доплыл");
        else
            System.out.println(animal.getName() + " не доплыл");
    }
    private static void toRun(Animal animal, int distance){
        if (animal.run(distance))
            System.out.println(animal.getName() + " добежал");
        else
            System.out.println(animal.getName() + " не добежал");
    }
}
