import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\Константин\\Desktop\\GB\\Java\\JavaHomeWork\\JavaHomeWork\\File2.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        line = line.replaceAll("[{\"}\\[\\]]", "");
        line = line.replace("фамилия:", "");
        line = line.replace("оценка:", "");
        line = line.replace("предмет:", "");
        String[] result = line.split(",");
        for (int i = 0; i < result.length-2; i+=3) {
            System.out.printf("Студент %s получил %s по предмету %s\n", result[i], result[i+1], result[i+2]);
        }
    }
}
