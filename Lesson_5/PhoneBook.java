
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class PhoneBook {
    Map<String, ArrayList<String>> phoneBook = new TreeMap<>();

    void contacts() {
        Scanner scanner = new Scanner(System.in);    
        boolean flag = true;
        while(flag) {
            System.out.println("Выберете действие:\n" +
                            "1 - Добавить контакт\n" +
                            "2 - Найти контакт\n" +
                            "3 - Удалить контакт\n" +
                            "4 - Удалить номер телефона\n" +
                            "5 - Выйти");
            String act = scanner.nextLine();
            switch (act) {
                case "1":
                    System.out.println("Введите имя контакта");    
                    String name = scanner.nextLine();
                    System.out.println("Введите номер телефона");
                    String phoneNumber = scanner.nextLine();
                    if(phoneBook.containsKey(name)){
                        ArrayList<String> phones = phoneBook.get(name);
                        phones.add(phoneNumber);
                    }
                    else{
                        ArrayList<String> phones = new ArrayList<>();
                        phones.add(phoneNumber);
                        phoneBook.put(name, phones);
                    }
                    break;
                case "2":
                    System.out.println("Введите имя контакта");    
                    String person = scanner.nextLine();
                    if(phoneBook.containsKey(person)) {
                        System.out.println(person + ": " + phoneBook.get(person));
                    }
                    else {
                        System.out.println("Данного имени нет");
                    }
                    break;
                case "3":
                    System.out.println("Введите контакт");    
                    String searchField = scanner.nextLine();
                    if(phoneBook.containsKey(searchField)) {
                        phoneBook.remove(searchField);
                    }
                    else {
                        System.out.println("Данного контакта не существует");
                    }
                    printPhoneBook();
                    break;
                case "4":
                    System.out.println("Введите номер телефона");    
                    searchField = scanner.nextLine();
                    if(removePhone(searchField)) {
                        printPhoneBook();
                    } else {
                        System.out.println("Данный номер не существует");
                    }
                    break;
                case "5":
                    flag = false;
                    break;
            }
        }           
    }

    void printPhoneBook() {
        System.out.println(phoneBook.toString());
    }

    boolean removePhone(String phone) {
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            ArrayList<String> list = entry.getValue();
            if(list.contains(phone)) {
                list.remove(list.indexOf(phone));
                phoneBook.put(name, list);
                return true;
            }
        }
        return false;
    }
}