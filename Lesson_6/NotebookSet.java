import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NotebookSet {
    Set<Notebook> setNotebooks = new HashSet<>();

    public void addNotebook(Notebook notebook) {
        setNotebooks.add(notebook);
    }

    public void printNotebookSet() {
        for (Notebook notebook : setNotebooks) {
            System.out.println(notebook);
        }
    }

    public List<Notebook> filterList() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        List<String> notebookBrands = new ArrayList<>();
        List<String> notebookRAM = new ArrayList<>();
        List<String> notebookSSD = new ArrayList<>();
        List<String> notebookOS = new ArrayList<>();
        List<String> notebookColors = new ArrayList<>();
        while (flag) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - Производитель\n" +
                    "2 - ОЗУ\n" +
                    "3 - Объем жесткого диска\n" +
                    "4 - Операционная система\n" +
                    "5 - Цвет\n" +
                    "6 - Показать ноутбуки");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Выберете производителя:");
                    String brand = scanner.nextLine();
                    notebookBrands.add(brand);
                    map.put(1, notebookBrands);
                    break;
                case "2":
                    System.out.println("Выбирете минимальное значение оперативной памяти: ");
                    Integer ram = scanner.nextInt();
                    notebookRAM.add(ram.toString());
                    map.put(2, notebookRAM);
                    for (Notebook notebook : setNotebooks) {
                        if (ram <= notebook.getIntegerRAM()) {
                            if (map.containsKey(2)) {
                                notebookRAM = map.get(2);
                                notebookRAM.add(notebook.getRAM());
                            } else {
                                notebookRAM.add(notebook.getRAM());
                                map.put(2, notebookRAM);
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.println("Выбирете минимальное значение объема жесткого диска: ");
                    Integer ssd = scanner.nextInt();
                    for (Notebook notebook : setNotebooks) {
                        if (ssd >= Integer.parseInt(notebook.getCapasitySSD())) {
                            if (map.containsKey(3)) {
                                notebookSSD = map.get(3);
                                notebookSSD.add(notebook.getCapasitySSD());
                            } else {
                                notebookSSD.add(notebook.getCapasitySSD());
                                map.put(3, notebookSSD);
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("Выберите операционную систему");
                    String opSys = scanner.nextLine();
                    notebookOS.add(opSys);
                    map.put(4, notebookOS);
                    break;
                case "5":
                    System.out.println("Выберите цвет:");
                    String colors = scanner.nextLine();
                    notebookColors.add(colors);
                    map.put(5, notebookColors);

                    break;
                case "6":
                    flag = false;
                    break;
            }
        }
        List<Notebook> filter = new ArrayList<>();
        for (Notebook notebook : setNotebooks) {
            boolean work = true;
            for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
                Integer key = entry.getKey();
                List<String> parameter = entry.getValue();
                switch (key) {
                    case 1:
                        if (!parameter.contains(notebook.getBrand())) {
                            work = false;
                        }
                        break;
                    case 2:
                        if (!parameter.contains(notebook.getRAM())) {
                            work = false;
                        }
                        break;
                    case 3:
                        if (!parameter.contains(notebook.getCapasitySSD())) {
                            work = false;
                        }
                        break;
                    case 4:
                        if (!parameter.contains(notebook.getOS())) {
                            work = false;
                        }
                        break;
                    case 5:
                        if (!parameter.contains(notebook.getColor())) {
                            work = false;
                        }
                        break;
                }
            }
            if (work)
                filter.add(notebook);
        }
        return filter;
    }
}