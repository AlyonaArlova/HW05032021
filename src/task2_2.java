public class task2_2 {
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 3; i < 24; i += 3) {
            ameba *= 2;
            System.out.println("Количество амеб равно = " + ameba + "," + "время равно = " + i);
        }
    }
}
