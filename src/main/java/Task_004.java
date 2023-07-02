import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task_004 {
    Object object = new Object();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(50));
        }
        System.out.printf("Изначальный список - %s\n", list);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (list.get(i)%2==0){
                temp.add(list.get(i));
        }
        }
        list.removeAll(temp);
        System.out.printf("Список без четных элементов - %s\n", list);
        list.sort(Comparator.naturalOrder());
        System.out.printf("Минимальное значение в списке - %s\n", list.get(1));
        System.out.printf("Максимально значение в списке - %s\n", list.get(list.size()-1));
        System.out.printf("Среднее значение в списке - %s\n", list.get(list.size()/2));
    }
}
