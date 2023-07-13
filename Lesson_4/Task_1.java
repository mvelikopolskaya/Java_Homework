// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int leng = sc.nextInt();
        LinkedList<Integer> list = newList(leng);
        System.out.println(list);
        System.out.println(reverseList(list));
        sc.close();
    }

    public static LinkedList<Integer> newList(int num) {
        Random rnd = new Random();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            newList.add(i, rnd.nextInt(0, 10));
        }
        return newList;
    }
    
    public static LinkedList<Integer> reverseList(LinkedList<Integer> ls) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        ListIterator<Integer> lsIterator = ls.listIterator(ls.size());
            while(lsIterator.hasPrevious()) {
                reverseList.add(lsIterator.previous());
            }
        return reverseList;
    }
}
