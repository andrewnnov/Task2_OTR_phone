package bannikov.phonebook;

import bannikov.phone.phonebook.IPhoneBook;
import bannikov.phone.phonebook.PhoneBookImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PhoneBookImpTest2 {

    @Test
    public void whenUserIsFalseThenReturnEmptyList() {
        IPhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addPhoneNumber("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        phoneBook.addPhoneNumber("Петров П.П.", "+8 800 2000 700");
        phoneBook.addPhoneNumber("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900",
                "+8 800 2000 000");
        List<String> phoneListResult = phoneBook.getPhoneNumberByName("Дед Мороз");
        List<String> phoneListExpected = new ArrayList<>();
        assertEquals(phoneListExpected, phoneListResult);
    }
}
