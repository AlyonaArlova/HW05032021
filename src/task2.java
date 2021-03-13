import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        in.close();

        switch (number) {
            case 1, 8:
                System.out.println("День недели - понедельник");
                break;
            case 2, 9:
                System.out.println("День недели - вторник");
                break;
            case 3:
                System.out.println("День недели - среда");
                break;
            case 4:
                System.out.println("День недели - четверг");
                break;
            case 5:
                System.out.println("День недели - пятница");
                break;
            case 6:
                System.out.println("День недели - суббота");
                break;
            case 7:
                System.out.println("День недели - воскресенье");
                break;
            default:
                System.out.println("Введите число больше нуля, но меньше 10");
        }
    }
}
