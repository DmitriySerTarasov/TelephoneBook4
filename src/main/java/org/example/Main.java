package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "67890");
        phoneBook.add("Charlie", "54321");

        System.out.println("Phone number of Alice: " + phoneBook.findByName("Alice"));
        System.out.println("Contact with number 67890: " + phoneBook.findByNumber("67890"));

        System.out.println("All contacts:");
        phoneBook.printAllNames();
    }

    public static class PhoneBook {
        private Map<String, String> contacts = new HashMap<>();

        public int add(String name, String number) {
            if (!contacts.containsKey(name)) {
                contacts.put(name, number);
            }
            return contacts.size();
        }

        public String findByNumber(String number) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                if (entry.getValue().equals(number)) {
                    return entry.getKey();
                }
            }
            return null;
        }

        public String findByName(String name) {
            return contacts.get(name);
        }

        public void printAllNames() {
            TreeSet<String> sortedNames = new TreeSet<>(contacts.keySet());
            for (String name : sortedNames) {
                System.out.println(name);
            }
        }
    }
}
