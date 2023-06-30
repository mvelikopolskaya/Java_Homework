//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.println(amount(n));
        System.out.println(factorial(n));
        scanner.close();
    }
    static int amount(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
                sum += i;
        }
        return sum;
    }

    static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }
}