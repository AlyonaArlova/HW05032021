public class task3_2 {
    public static void main(String[] args) {
        int summa = 0;


        for (int i = 1; i <= 99; i++)
            if (i % 2 == 0) {
                summa = summa + i;
            }
        System.out.println("Сумма нечетных чисел равна = " + summa);

    }
}

