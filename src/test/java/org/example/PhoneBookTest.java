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
}
