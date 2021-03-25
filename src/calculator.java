import java.util.Scanner;

class Calculator {
    private int result;
    private int x;
    private int y;
    private char operator;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public int addition(int x, int y) {
        return x + y;
    }


    public int subtraction(int x, int y) {
        return x - y;
    }


    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator v0.1 \n");
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("\nPlease enter two numbers");
        System.out.print("\nFirst number: ");
        calc.setX(scanner.nextInt());
        System.out.print("\nSecond number: ");
        calc.setY(scanner.nextInt());
        System.out.println("\nSelect between (*, /, +, -) or \"e\" to exit\nType out the character in a single letter: ");
        calc.setOperator(scanner.next().charAt(0));
        calculate(calc, scanner);

    }

    private static void calculate(Calculator calc, Scanner scanner) {
        switch (calc.getOperator()) {
            case '+':
                System.out.println(calc.addition(calc.getX(), calc.getY()));
                break;
            case '-':
                System.out.println(calc.subtraction(calc.getX(), calc.getY()));
                break;
            case '*':
                System.out.println(calc.multiplication(calc.getX(), calc.getY()));
                break;
            case '/':
                System.out.println(calc.division(calc.getX(), calc.getY()));
                break;
            case 'e':
                System.exit(0);
            default:
                System.out.println("Wrong operation, please enter valid operator");
                System.out.println("\nSelect between (*, /, +, -) or \"e\" to exit\nType out the character in a single letter: ");
                calc.setOperator(scanner.next().charAt(0));
                calculate(calc, scanner);
        }
        scanner.close();
        System.out.println(" Closing Application ");
    }
}