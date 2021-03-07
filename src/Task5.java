import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i=0;i< array.length; i++){
            array[i]= random.nextInt(10);
        }
        System.out.println("Изначальный массив" + Arrays.toString(array));

            for (int i = 0; i < array.length-1; i++){
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int t = array[i];
                        array[i] = array[j];
                        array[j] = t;
                    }
                }
            }
                    System.out.println("Отсортированный массив" + Arrays.toString(array));
                }
            }





