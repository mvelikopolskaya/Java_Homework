// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int leng = scanner.nextInt();
        List<Integer> list = newList(leng);
        System.out.println(list);
        oddNumbers(list);
        scanner.close();
    }    
    
    public static List<Integer> newList(int num) {
        List<Integer> newList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            newList.add(i, random.nextInt(0, 100));
        }
        return newList;
    }
    
    public static void oddNumbers(List<Integer> newList) {
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < newList.size(); i++) {
            int num = newList.get(i);
            if (num % 2 == 1) {
                oddList.add(newList.get(i));
            } 
        }
        System.out.println(oddList);
    }
}