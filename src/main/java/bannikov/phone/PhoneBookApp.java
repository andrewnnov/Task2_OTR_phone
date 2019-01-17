package bannikov.phone;

import bannikov.phone.phonebook.IPhoneBook;
import bannikov.phone.phonebook.PhoneBookImpl;
import bannikov.phone.util.ConsoleHelper;
import bannikov.phone.util.PrintHelper;

import java.util.List;

public class PhoneBookApp {

    public static void main(String[] args) {

        IPhoneBook phoneBook = getSamplePhoneBook();
        String fio = ConsoleHelper.getStrFromKb("Enter the name: ");
        List<String> phoneNumbersFound = phoneBook.getPhoneNumberByName(fio);
        PrintHelper.print(phoneNumbersFound);
    }

    private static IPhoneBook getSamplePhoneBook() {
        IPhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addPhoneNumber("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        phoneBook.addPhoneNumber("Петров П.П.", "+8 800 2000 700");
        phoneBook.addPhoneNumber("Сидоров С.С.", "+8 800 2000 800",
                "+8 800 2000 900", "+8 800 2000 000");
        return phoneBook;
    }
}
