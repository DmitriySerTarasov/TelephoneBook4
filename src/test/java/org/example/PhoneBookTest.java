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
}
