package bannikov.phone.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookImpl implements IPhoneBook {

    private static final Map<String, List<String>> userMap = new HashMap<>();

    @Override
    public void addPhoneNumber(String name, String... phoneNumbersToAdd) {
        for (String phonNumber : phoneNumbersToAdd) {
            List<String> phoneNumbers = userMap.getOrDefault(name, new ArrayList<>());
            phoneNumbers.add(phonNumber);
            userMap.put(name, phoneNumbers);
        }
    }

    @Override
    public List<String> getPhoneNumberByName(String name) {
        return userMap.getOrDefault(name, new ArrayList<>());
    }
}
