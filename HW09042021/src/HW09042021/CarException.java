//Создать собственное исключение (custom exception).

package HW09042021;

public class CarException extends Exception {

    public CarException() {
        System.out.println("Число является четным");
    }
}

