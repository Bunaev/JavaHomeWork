import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\Константин\\Desktop\\GB\\Java\\JavaHomeWork\\JavaHomeWork\\File2.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        line = line.replaceAll("[{\"\"}\\[\\]]", "");
        line = line.replace("фамилия:", "");
        line = line.replace("оценка:", "");
        line = line.replace("предмет:", "");
        String[] result = line.split(",");
        System.out.printf("Студент %s получил %s по предмету %s\n", result[0], result[1], result[2]);
        System.out.printf("Студент %s получил %s по предмету %s\n", result[3], result[4], result[5]);
        System.out.printf("Студент %s получил %s по предмету %s\n", result[6], result[7], result[8]);
    }
}
