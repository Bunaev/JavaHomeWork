import java.util.*;

public class Task_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> sex = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> tmpSex = new ArrayList<>();
        while (true) {
            System.out.println("Введите фамилию контакта: ");
            surname.add(scanner.nextLine());
            System.out.println("Введите имя контакта: ");
            name.add(scanner.nextLine());
            System.out.println("Введите отчество контакта: ");
            secondName.add(scanner.nextLine());
            System.out.println("Введите возраст контакта: ");
            age.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Введите пол контакта: ");
            sex.add(scanner.nextLine().toLowerCase().contains("м"));
            tmp.add(age.size() - 1);
            System.out.println("Продолжить ввод (да/нет): ");
            String cont = scanner.nextLine();
            if (cont.toLowerCase().contains("н")) break;
        }
        for (int i = 0; i < surname.size(); i++) {
            System.out.println(surname.get(i) + " " + name.get(i).toUpperCase().charAt(0) + ". " + secondName.get(i).toUpperCase().charAt(0) + "., возраст:" + age.get(i) + ", пол: " + (sex.get(i) ? "Мужской" : "Женский"));
        }
        System.out.println("\n");
        System.out.println("Отсортировать по возрасту?");
        System.out.println("\n");
        String ageSort = scanner.nextLine();
        if (ageSort.toLowerCase().contains("д")) {
            tmp.sort(Comparator.comparingInt(age::get));
            for (int i = 0; i < age.size() - 1; i++) {
                for (int j = i + 1; j < age.size() - 1; j++) {
                    if (age.get(j) < age.get(j)) {
                        Collections.swap(tmp, j, i);
                    }
                }
            }
        }
        for (int i = 0; i < age.size(); i++) {
            System.out.println(surname.get(tmp.get(i)) + " " + name.get(tmp.get(i)).toUpperCase().charAt(0) + ". " + secondName.get(tmp.get(i)).toUpperCase().charAt(0) + "., возраст:" + age.get(tmp.get(i)) + ", пол: " + (sex.get(tmp.get(i)) ? "Мужской" : "Женский"));
        }
        System.out.println("\n");
        System.out.println("Отсортировать по возрасту и полу?");
        System.out.println("\n");
        String sexSort = scanner.nextLine();
        if (sexSort.toLowerCase().contains("д")) {
            for (int i = 0; i < sex.size(); i++) {
                if (sex.get(i)) {
                    tmpSex.add(i);
                }
            }
            for (Integer value : tmp) {
                if (tmpSex.contains(value)) {
                    System.out.println(surname.get(value) + " " + name.get(value).toUpperCase().charAt(0) + ". " + secondName.get(value).toUpperCase().charAt(0) + "., возраст:" + age.get(value) + ", пол: " + (sex.get(value) ? "Мужской" : "Женский"));
                }
            }
            for (Integer integer : tmp) {
                if (!tmpSex.contains(integer)) {
                    System.out.println(surname.get(integer) + " " + name.get(integer).toUpperCase().charAt(0) + ". " + secondName.get(integer).toUpperCase().charAt(0) + "., возраст:" + age.get(integer) + ", пол: " + (sex.get(integer) ? "Мужской" : "Женский"));
                }
            }
        }
    }
}



