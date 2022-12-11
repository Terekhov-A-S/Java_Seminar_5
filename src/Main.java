/* Задача 1. Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что один человек может иметь несколько телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        Directory directory = new Directory();

        directory.add("Ефимов", "8-956-652-34-82");
        directory.add("Ефимов", "8-652-635-56-87");
        directory.add("Соколов", "8-895-749-12-25");
        directory.add("Соколов", "8-326-516-69-87");
        directory.add("Ефимов", "8-715-256-85-94");
        directory.add("Иванов", "8-963-265-65-76");
        directory.add("Соколов", "8-964-529-86-32");
        directory.add("Петров", "8-326-382-69-94");
        directory.add("Иванов", "8-968-362-13-27");

        System.out.println(directory.get("Ефимов"));
        System.out.println(directory.get("Иванов"));
        System.out.println(directory.get("Соколов"));
        System.out.println(directory.get("Петров"));
    }
}

class Directory {
    private Map<String, List<String>> directoryHm = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (directoryHm.containsKey(surname)) {
            phoneNumberList = directoryHm.get(surname);
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return directoryHm.get(surname);
    }

}
