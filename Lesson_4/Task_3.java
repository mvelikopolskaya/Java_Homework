// Найдите сумму всех элементов LinkedList, 
// сохраняя все элементы в списке. 
// Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int leng = sc.nextInt();
        LinkedList<Integer> list = newList(leng);
        System.out.println(list);
        System.out.println("Сумма всех элементов списка равна: " + elementsSum(list));
    }

    public static LinkedList<Integer> newList(int num) {
        Random rnd = new Random();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            newList.add(i, rnd.nextInt(0, 10));
        }
        return newList;
    }

    public static Integer elementsSum(LinkedList<Integer> ls) {
        int sum = 0;
        ListIterator<Integer> lsIterathor = ls.listIterator(0);
        while (lsIterathor.hasNext()) {
            sum+=lsIterathor.next();
        }
        return sum;
    }
}
