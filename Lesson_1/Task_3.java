// Реализовать простой калькулятор

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        System.out.println(calc(a, b, operation));
        scanner.close();
    }

    static double calc(double num_a, double num_b, char op) {
        double result = 0;
        switch(op) {
            case '+':
                result = num_a + num_b;
                break;
            case '-':
                result = num_a - num_b;
                break;
            case '*':
                result = num_a * num_b;
                break;
            case '/':
                if (num_b != 0) {
                    result = num_a / num_b;
                } else System.out.println("Деление на ноль");
                break;
        }
        return result;
    }
}