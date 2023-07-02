import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_002 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Константин\\Desktop\\GB\\Java\\JavaHomeWork\\JavaHomeWork\\File.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        scanner.close();
        line = line.replace(":", " = ");
        line = line.replaceAll("[{\"\"}]", "");
        String[] result = line.split(", ");
        String req = "select * from students where ";
        for (int i = 0; i < result.length; i++) {
            boolean bool = result[i].contains("null");
            if (bool == false) {
                req = req + result[i]+ ", ";

            }
        }
        System.out.println(req.replaceAll(", $",""));
    }
}