// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке. 
// Collections.frequency(list, item)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        
        String[] planets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        List<String> planetsList = newList(planets);
        System.out.println(planetsList);
        System.out.println(planetFrequency(planetsList));
    }

    public static List<String> newList(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> newList = new ArrayList<String>();
        System.out.println("Введите размер списка");
        int leng = scanner.nextInt();
        for (int i = 0; i < leng; i++) {
            int randIndex = random.nextInt(0, arr.length - 1);
            newList.add(i, arr[randIndex]);
        }
        return newList;
    }

    public static Map<String, Integer> planetFrequency(List<String> newList) {
        Map<String, Integer> newMap= new TreeMap();
            for (int i = 0; i < newList.size(); i++) {
                newMap.put(newList.get(i), Collections.frequency(newList, newList.get(i)));
            }
            return newMap;
    }
}
