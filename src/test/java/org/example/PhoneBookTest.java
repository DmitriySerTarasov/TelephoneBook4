package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Alice", "12345");
        assertEquals(1, count);
    }
    @Test
    public void testAddDuplicate() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        int count = phoneBook.add("Alice", "54321");
    }
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        String name = phoneBook.findByNumber("12345");
        assertEquals("Alice", name);
    }
    @Test
    public void testFindByNumberNotFound() {
        PhoneBook phoneBook = new PhoneBook();
        String name = phoneBook.findByNumber("99999");
        assertEquals(null, name);
    }
    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        String number = phoneBook.findByName("Alice");
        assertEquals("12345", number);
    }
    @Test
    public void testFindByNameNotFound() {
        PhoneBook phoneBook = new PhoneBook();
        String number = phoneBook.findByName("Bob");
        assertEquals(null, number);
    }
    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "67890");
        phoneBook.printAllNames();
    }
}
