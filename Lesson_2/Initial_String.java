import java.io.FileWriter;

public class Initial_String {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    writeToFile(json);
    }

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
}
