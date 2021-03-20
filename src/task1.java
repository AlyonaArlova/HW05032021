import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input r: ");
        double r = in.nextDouble();
        in.close();
        double s = a * b;
        double s_circle = Math.PI * r * r;
        if (s_circle > s) {
            System.out.println("Площадь круга больше, Отверстие можно закрыть круглой картонкой");
        } else if (s_circle < s) {
            System.out.println("Площадь круга меньше, Отверстие нельзя закрыть круглой картонкой");
        } else System.out.println("Площади равны, Отверстия равны");
    }
}
