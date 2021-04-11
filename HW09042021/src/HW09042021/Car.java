//Если полученное число оказалось четным, то выбрасывается  созданное ранее исключение.
// Если все хорошо, и исключение не вылетело, то в консоль выводится сообщение о том,  что автомобиль с такой-то маркой завелся.
package HW09042021;

import java.util.Random;

public class Car {
    private int result;
    private String model;
    private int speed;
    private double price;
    private Random rand = new Random();

    public Car(String model) {
        this.model = model;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws CarException {

        result = rand.nextInt(20);
        if (result % 2 == 0) {
            throw new CarException();
        } else {
            System.out.printf("Авто с маркой %s завелся%n", model);
        }

    }
}
