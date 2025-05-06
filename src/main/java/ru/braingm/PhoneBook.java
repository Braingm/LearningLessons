package ru.braingm;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<Long>> numberLIst = new HashMap<>();

    public void add(String name, Long number) {
        if (numberLIst.containsKey(name)) {
            numberLIst.get(name).add(number);
        } else {
            HashSet<Long> numbersSet = new HashSet<>();
            numbersSet.add(number);
            numberLIst.put(name, numbersSet);
        }
    }

    public void get(String name){
        if (numberLIst.containsKey(name)){
            numberLIst.get(name).forEach(System.out::println);
        } else {
            System.out.println("Такой фамилии в списке нет");
        }
    }
}
