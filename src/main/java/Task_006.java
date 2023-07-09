import java.util.*;

public class Task_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        String menu = "1. Показать все контакты;\n2. Добавить контакт;\n3. Удалить контакт\n4. Выход\n";
        int choice;
        String name;
        while (true) {
            System.out.println(menu);
            System.out.println("Выберете пункт меню: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                if (phoneBook.isEmpty()) {
                    System.out.println("=".repeat(30) + "\n" + "Телефонная книга пуста! Добавьте контакт." + "\n" + "=".repeat(30) + "\n");
                    continue;
                } else if (!phoneBook.isEmpty()) {
                    LinkedHashMap<String, String> pb = new LinkedHashMap<>();
                    int max = 20;
                    while (max>3) {
                        for (String key : phoneBook.keySet()) {
                            if (phoneBook.get(key).split(", ").length == max) {
                                pb.put(key, phoneBook.get(key));
                            }
                        }
                        max-=1;
                    }
                    for (String key : phoneBook.keySet()) {
                        if (phoneBook.get(key).split(", ").length < 4) {
                            pb.put(key, phoneBook.get(key));
                        }
                    }
                    System.out.println("=".repeat(30) + "\n");
                    ArrayList<String> keys = new ArrayList<>(pb.keySet());
                    for (int i = 0; i < keys.size(); i++) {
                        ArrayList<String> values = new ArrayList<>(List.of(pb.get(keys.get(i)).split(", ")));
                        if (values.size() > 3) {
                            System.out.printf("%d. %s, телефон: %s, ", i + 1, keys.get(i), values.get(0));
                            for (int k = 3; k < values.size(); k++) {
                                System.out.printf("%s, ", values.get(k));
                            }
                            System.out.printf("возраст: %s, пол: %s.;\n", values.get(1), values.get(2).toUpperCase());
                        } else {
                            for (int j = 0; j < 1; j++) {
                                System.out.printf("%d. %s, телефон: %s, возраст: %s, пол: %s.;\n", i + 1, keys.get(i), values.get(j), values.get(j + 1), values.get(j + 2).toUpperCase());
                            }
                        }
                    }
                    System.out.println("\n" + "=".repeat(30) + "\n");
                    continue;
                }
            } else if (choice == 2) {
                System.out.println("Введите ФИО контакта: ");
                name = scanner.nextLine();
                if (phoneBook.containsKey(name)) {
                    System.out.println("Данный контакт уже занесён в телефонную книгу. Хотите добавить новый номер телефона? (Да/Нет)");
                    String newData = scanner.nextLine();
                    if (newData.toLowerCase().contains("д")) {
                        System.out.println("Введите новый номер телефона: ");
                        phoneBook.put(name, phoneBook.get(name) + ", " + scanner.nextLine());
                        System.out.println("=".repeat(30) + "\n" + "Телефон успешно добавлен!" + "\n" + "=".repeat(30) + "\n");
                    }
                    continue;
                }
                System.out.println("Введите номер телефона: ");
                phoneBook.put(name, scanner.nextLine());
                System.out.println("Введите возраст контакта: ");
                phoneBook.put(name, phoneBook.get(name) + ", " + scanner.nextLine());
                System.out.println("Введите пол контакта: ");
                phoneBook.put(name, phoneBook.get(name) + ", " + scanner.nextLine());
                System.out.println("=".repeat(30) + "\n" + "Контакт успешно добавлен!" + "\n" + "=".repeat(30) + "\n");
                continue;
            } else if (choice == 3) {
                System.out.println("Введите номер контакта, который хотите удалить: ");
                int del = Integer.parseInt(scanner.nextLine());
                ArrayList<String> pb = new ArrayList<>(phoneBook.keySet());
                for (int i = 0; i < pb.size(); i++) {
                    if (del - 1 == i) {
                        phoneBook.remove(pb.get(i));
                    }
                }
                System.out.println("=".repeat(30) + "\n" + "Контакт успешно удален!" + "\n" + "=".repeat(30) + "\n");
                continue;
            }
            System.out.println("До новых встреч!");
            break;
        }
    }
}









