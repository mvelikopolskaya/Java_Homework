//Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например,
// 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите равенство: ");
        String equation = scanner.nextLine();
        if (findVariable(equation).isBlank()) {
            System.out.println("Нет решения");
        }
        else {
            System.out.println(findVariable(equation));;
        }
        scanner.close();
    }

    static String[] stringSplit(String text) {
        String variable_1 = text.substring(0, text.indexOf("+"));
        String variable_2 = text.substring(text.indexOf("+") + 1, text.indexOf("="));
        String sum = text.substring(text.indexOf("=") + 1);
        variable_1 = variable_1.trim();
        variable_2 = variable_2.trim();
        sum = sum.trim();
        String[] arrayText = new String[]{variable_1, variable_2, sum};
        return arrayText;
    }

    static String findVariable(String text) {
        String[] arrText = stringSplit(text);
        String result = "";
        int sum = Integer.parseInt(arrText[2]);
        for (int i = 0; i < 10; i++) {
            char ichar = Character.forDigit(i, 10);
            String var_1 = arrText[0].replace('?', ichar);
            int num_a = Integer.parseInt(var_1);
            for (int j = 0; j < 10; j++) {
                char jchar = Character.forDigit(j, 10);
                String var_2 = arrText[1].replace('?', jchar);
                int num_b = Integer.parseInt(var_2);
                if (num_a + num_b == sum) {
                    result = Integer.toString(num_a) + " + " + Integer.toString(num_b) + " = " + Integer.toString(sum); 
                }
            }
        }
        return result;
    }
}