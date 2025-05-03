package ru.braingm.les3;

import ru.braingm.les3.Fruits.Apple;
import ru.braingm.les3.Fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"A", "B", "C", "D", "E"};
        ArrayList<String> arrayList = arrayToArrayList(strings);
        arrayList.forEach(System.out::println);
        positionChange(arrayList, 1, 4);
        arrayList.forEach(System.out::println);

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.put(new Apple());
        appleBox1.put(new Apple());
        appleBox1.put(new Apple());
        appleBox2.put(new Apple());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());

        System.out.println(appleBox1.compare(orangeBox));

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        appleBox1.moveTo(appleBox2);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());

    }


    public static <T> void positionChange(List<T> list, int firstPosition, int lastPosition) {
        T o1 = list.get(firstPosition);
        T o2 = list.get(lastPosition);
        list.remove(firstPosition);
        list.add(firstPosition, o2);
        list.remove(lastPosition);
        list.add(lastPosition, o1);
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] objects) {
        return new ArrayList<>(Arrays.asList(objects));
    }
}