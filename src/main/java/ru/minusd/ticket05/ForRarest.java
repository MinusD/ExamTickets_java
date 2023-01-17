package ru.minusd.ticket05;

/*
 * Напишите метод rarest, который принимает Map, ключи которого являются строками, а значения являются целыми числами.
 * Метод возращает челочисленное значение, которое встречаеся в словаре наименьнее количество раз.
 * Если словарь пуст, скгенерируется исключение IllegalArgumentException.
 */

import java.util.HashMap;
import java.util.Map;

public class ForRarest {
    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) { // Проверка на пустоту
            throw new IllegalArgumentException();
        }
        int min = Integer.MAX_VALUE;
        int result = 0;

        // Перебираем все значения в словаре
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = 0;
            // Считаем количество вхождений каждого значения
            for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                if (entry.getValue().equals(entry2.getValue())) {
                    count++;
                }
            }

            // Если количество вхождений меньше минимального, то обновляем минимальное значение
            if (count < min) {
                min = count;
                result = entry.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Alissia", 22);
        map.put("Char", 25);
        map.put("Dan", 25);
        map.put("Jeff", 20);
        map.put("Keasy", 20);
        map.put("Kim", 20);
        map.put("Morgan", 20);
        map.put("Rayn", 25);
        map.put("Stef", 22);

        System.out.println(rarest(map));
    }

}
