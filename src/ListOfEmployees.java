/* Задача 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ListOfEmployees {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван " +
                "Карина " +
                "Сергей " +
                "Иван " +
                "Сергей " +
                "Сергей " +
                "Светлана " +
                "Кристина " +
                "Анна " +
                "Анна " +
                "Иван " +
                "Мария " +
                "Петр " +
                "Павел " +
                "Петр " +
                "Мария " +
                "Марина " +
                "Сергей " +
                "Сергей " +
                "Мария " +
                "Мария " +
                "Марина " +
                "Анна " +
                "Мария " +
                "Петр " +
                "Мария " +
                "Иван ";
        String[] listOfNames = employees.split(" ");
        for (int i = 0; i < listOfNames.length; i += 1) {
            if (nameMap.containsKey(listOfNames[i])) {
                nameMap.replace(listOfNames[i], nameMap.get(listOfNames[i]) + 1);
            } else {
                nameMap.put(listOfNames[i], 1);
            }
        }
        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}
