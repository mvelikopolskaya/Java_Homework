public class Notebook {
    String notebookName;
    Integer RAM;
    Integer capasitySSD;
    String os;
    String color;
    
    public Notebook(String notebookName, Integer RAM, Integer capasitySSD, String os, String color) {
        this.notebookName = notebookName;
        this.RAM = RAM;
        this.capasitySSD = capasitySSD;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return this.notebookName;
    }

    public String getRAM() {
        return this.RAM.toString();
    }
    public Integer getIntegerRAM() {
        return this.RAM;
    }

    public String getCapasitySSD() {
        return this.capasitySSD.toString();
    }

    public Integer getCapasitySSDInteger() {
        return this.capasitySSD;
    }

    public String getOS() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Производитель ноутбука: " + notebookName + "\n" + "Объем ОЗУ: " + RAM + " Гб" + "\n" + "ОБъем ЖД: " + capasitySSD + " Гб" + "\n" + "Операционная система: " + os + "\n" + "Цвет: " + color + "\n";
    }
}
