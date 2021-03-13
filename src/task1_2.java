public class task1_2 {
    public static void main(String[] args) {
        double firstDayRunValue = 10.0;
        double newDayRunValue = firstDayRunValue;
        double sum = 0;
        for (int a = 0; a < 6; a++) {
            newDayRunValue = newDayRunValue + newDayRunValue * 0.1;
            sum += newDayRunValue;
        }
        System.out.println("суммарный путь = " + sum);
    }
}
