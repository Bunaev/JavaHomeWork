import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Random;

public class Task_001 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.printf("Число в промежутке от 0 до 2000 - %s\n", i);
        int n = Integer.toBinaryString(i).length();
        System.out.printf("Номер старшего значащего бита выпавшего числа - %s\n", n);
        int size1 = 0;
        for (int k = i; k < Short.MAX_VALUE; k++){
            if(k%n == 0){
                size1+=1;
            }
        }
        int[] m1 = new int[size1];
        int tmp = 0;
        for (int k = i; k < Short.MAX_VALUE; k++){
            if(k%n == 0){
                m1[tmp] = k;
                tmp+=1;
            }
        }
        System.out.printf("Массив чисел, кратных %s в диапазоне от 0 до %s - %s\n", n, Short.MAX_VALUE, Arrays.toString(m1));
        int size2 = 0;
        for (int k = Short.MIN_VALUE; k < i; k++){
            if(k%n == 0){
                size2+=1;
            }
        }
        int[] m2 = new int[size2];
        int tmp2 = 0;
        for (int k = Short.MIN_VALUE; k < i; k++){
            if(k%n == 0){
                m2[tmp2] = k;
                tmp2+=1;
            }
        }
        System.out.printf("Массив чисел, кратных %s в диапазоне от %s до %s - %s", n, Short.MIN_VALUE,i , Arrays.toString(m2));

    }
}
