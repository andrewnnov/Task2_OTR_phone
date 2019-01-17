package bannikov.phone.util;

import java.util.List;

public class PrintHelper {

    public static void print(List<String> listOfPhoneNumber){

        if(listOfPhoneNumber.size() == 0) {
            System.out.println("Такого пользователя нет в БД");
        }

        for (int i = 0; i < listOfPhoneNumber.size() ; i++) {
            int lineNumber = i + 1;
            String phoneNumber = listOfPhoneNumber.get(i);
            System.out.println(lineNumber + ". " + phoneNumber);
        }
    }


}
