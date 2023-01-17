package ru.minusd.ticket03;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ForIsUnique {
    public static boolean isUnique(Map<String, String> map) {
        for (String key : map.keySet()) {
            for (String key2 : map.keySet()) {
                if (!Objects.equals(key, key2) && map.get(key).equals(map.get(key2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");

        System.out.println(isUnique(map));
        map.put("Kendrick", "Perkins");
        System.out.println(isUnique(map));
    }
}
