package homework;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Alice", "1234567890");
        phoneBook.addContact("Bob", "2345678901");
        phoneBook.addContact("Alice", "3456789012");
        phoneBook.addContact("Charlie", "4567890123");
        phoneBook.addContact("Bob", "5678901234");
        phoneBook.addContact("Bob", "6789012345");

        phoneBook.printSortedPhoneBook();
    }
}
