package ru.braingm.Dubles;

import java.util.HashMap;

public class DublesFinder {
    public static void findDoubles(String[] inputArray) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String s : inputArray) {
            if (result.containsKey(s)) {
                int count = result.get(s) + 1;
                result.replace(s, count);
            } else {
                result.put(s, 1);
            }
        }

        result.forEach((s, i) -> {
            System.out.println(
                    s + " встречается " + i + " раз"
            );
        });
    }
}
