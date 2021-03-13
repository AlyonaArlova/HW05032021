import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = -11;
        int max = 10;
        int sum = 0;
        int maxI = 0;
        int minI = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i < 0) {
                sum += i;
            }
        }
        System.out.println("Сумма отрицательных элементов:" + sum);
    }
}