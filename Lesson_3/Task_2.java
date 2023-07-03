// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка. 
// Collections.max()

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int leng = scanner.nextInt();
        List list = newList(leng);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(avgNum(list));
        scanner.close();
    }

     public static List<Integer> newList (int num) {
        List<Integer> newList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
           newList.add(i, random.nextInt(0, 100)); 
        }
        return newList;
    }

    public static double avgNum(List<Integer> newList) {
        int sum = 0;
        double listSize = newList.size();
        for (int i = 0; i < listSize; i++) {
            sum += newList.get(i);
        }
        double avg = sum / listSize;
        return avg;
    }
}
