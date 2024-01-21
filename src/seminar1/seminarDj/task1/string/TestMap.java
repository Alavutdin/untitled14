package seminar1.seminarDj.task1.string;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        // Создаем и заполняем словарь имен и возрастов
        Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("Анна", 25);
        dictionary.put("Петр", 32);
        dictionary.put("Мария", 18);
        dictionary.put("Иван", 40);
        dictionary.put("Елена", 28);

        // Сортировка словаря по значению (возрастанию)
        List<Map.Entry<String, Integer>> sortedAscending = new ArrayList<>(dictionary.entrySet());
        Collections.sort(sortedAscending, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Вывод отсортированного словаря (по возрастанию)
        System.out.println("Словарь, отсортированный по возрастанию:");
        for (Map.Entry<String, Integer> entry : sortedAscending) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Сортировка словаря по значению (убыванию)
        List<Map.Entry<String, Integer>> sortedDescending = new ArrayList<>(dictionary.entrySet());
        Collections.sort(sortedDescending, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Вывод отсортированного словаря (по убыванию)
        System.out.println("\nСловарь, отсортированный по убыванию:");
        for (Map.Entry<String, Integer> entry : sortedDescending) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
