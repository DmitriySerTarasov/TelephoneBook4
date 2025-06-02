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


}
