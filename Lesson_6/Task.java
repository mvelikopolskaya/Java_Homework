// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Работу сдать как обычно ссылкой на гит репозиторий
// Частые ошибки:
// 1. Заставляете пользователя вводить все существующие критерии фильтрации
// 2. Невозможно использовать более одного критерия фильтрации одновременно
// 3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
// 4. Работа выполнена только для каких то конкретных ноутбуков, 
// и если поменять характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно


public class Task {
    public static void main(String[] args) {
        NotebookSet notebooks = new NotebookSet();

        Notebook notebook1 = new Notebook("Acer", 16, 512, "Windows", "grey");
        Notebook notebook2 = new Notebook("Acer", 8, 512, "Windows", "black");
        Notebook notebook3 = new Notebook("Lenovo", 16, 512, "Windows", "black");
        Notebook notebook4 = new Notebook("Lenovo", 8, 512, "Windows", "grey");
        Notebook notebook5 = new Notebook("Asus", 16, 1000, "Windows", "black");
        Notebook notebook6 = new Notebook("Asus", 32, 512, "Windows", "black");
        Notebook notebook7 = new Notebook("Apple", 8, 256, "macOS", "grey");
        Notebook notebook8 = new Notebook("Apple", 8, 512, "macOS", "black");
        Notebook notebook9 = new Notebook("Apple", 16, 512, "macOS", "grey");
        Notebook notebook10 = new Notebook("Honor", 16, 512, "Windows", "white");

        notebooks.addNotebook(notebook1);
        notebooks.addNotebook(notebook2);
        notebooks.addNotebook(notebook3);
        notebooks.addNotebook(notebook4);
        notebooks.addNotebook(notebook5);
        notebooks.addNotebook(notebook6);
        notebooks.addNotebook(notebook7);
        notebooks.addNotebook(notebook8);
        notebooks.addNotebook(notebook9);
        notebooks.addNotebook(notebook10);
        
        System.out.println(notebooks.filterList());
    }
}