import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Methods {
    public static void writeToFile(String text) {
        try {
            String filePath = "Grades.txt";
            FileWriter writer = new FileWriter(filePath);
            writer.append(text);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
