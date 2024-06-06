package homework;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        phoneBook.putIfAbsent(name, new HashSet<>());
        phoneBook.get(name).add(phone);
    }

    public void printSortedPhoneBook() {
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.println("Name: " + entry.getKey());
            System.out.println("Phones: " + entry.getValue());
        }
    }
}
