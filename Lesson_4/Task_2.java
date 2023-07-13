// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        enqueue(list);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(first(list));
    }

    public static void enqueue(LinkedList<Integer> ls) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Добавте элемент в список");
    int num = sc.nextInt();
    ls.addLast(num);
    }

    public static Integer dequeue(LinkedList<Integer> ls) {
        return ls.pollFirst();
    }

    public static Integer first(LinkedList<Integer> ls) {
        return ls.peekFirst();
    }
}
