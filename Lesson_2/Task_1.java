// *Получить исходную json строку из файла, используя FileReader или Scanner
// Дана json строка вида:
// String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
// "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
// "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

// Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// Используйте StringBuilder для подготовки ответа. 
// Далее создайте метод, который запишет
// результат работы в файл. Обработайте исключения 
// и запишите ошибки в лог файл с помощью Logger.

// *Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String filePath = "Grades.txt";
        String gradesList = readFile(filePath);
        //writeToFile(formatedeString(gradesList));
        //System.out.println(formatedeString(gradesList));
        splitString(gradesList);
    }
    

    // public static String formatedeString (String text) {
    //     StringBuilder strbuilder = new StringBuilder(text);

    // }

    public static String[] splitString(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.deleteCharAt(stringBuilder.indexOf("["));
        stringBuilder.deleteCharAt(stringBuilder.indexOf("]"));
        for (int i = 0; i < stringBuilder.length(); i++) {
            
        }

        return arrText;
    }

    public static String readFile(String text) {
        File file = new File(text);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                //stringBuilder.append("\n");
                }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void writeToFile(String text) {
        try {
            String filePath = "Grades_List.txt";
            FileWriter writer = new FileWriter(filePath);
            writer.append(text);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}