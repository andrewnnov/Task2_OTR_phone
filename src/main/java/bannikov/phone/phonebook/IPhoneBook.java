package bannikov.phone.phonebook;

import java.util.List;

public interface IPhoneBook {

    void addPhoneNumber(String name, String... phoneNumber);

    List<String> getPhoneNumberByName(String name);

}
