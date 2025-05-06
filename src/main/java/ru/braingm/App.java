package ru.braingm;

import ru.braingm.Dubles.DublesFinder;

public class App {
    public static void main(String[] args) {

        String[] strings = new String[]{"Дерево", "Бревно", "Лопата", "Дерево", "Бревно", "Сверхразум", "Дерево"};
        DublesFinder.findDoubles(strings);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Васькин", 89999999999L);
        phoneBook.add("Васькин", 81111111111L);
        phoneBook.get("Васькин");
    }
}