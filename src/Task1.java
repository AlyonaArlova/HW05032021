import javax.print.DocFlavor;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input r: ");
        double r= in.nextDouble();
        in.close();
        double S = a*b;
        double S_circle= Math.PI*r*r;
        if ( S_circle > S) {System.out.println("Площадь круга больше, Отверстие можно закрыть круглой картонкой");}
        else if (S_circle < S) {System.out.println("Площадь круга меньше, Отверстие нельзя закрыть круглой картонкой");}
        else System.out.println("Площади равны, Отверстия равны");
    }
}
