package bannikov.phonebook;

import bannikov.phone.phonebook.IPhoneBook;
import bannikov.phone.phonebook.PhoneBookImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class PhoneBookImpTest {
    @Test
    public void whenUserIsTrueThenReturnNotEmptyList() {
        IPhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addPhoneNumber("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        phoneBook.addPhoneNumber("Петров П.П.", "+8 800 2000 700");
        phoneBook.addPhoneNumber("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900",
                "+8 800 2000 000");
        List<String> phoneListResult = phoneBook.getPhoneNumberByName("Иванов И.И.");
        List<String> phoneListExpected = Arrays.asList("+8 800 2000 500", "+8 800 200 600");
        assertEquals(phoneListExpected, phoneListResult);
    }


}
