//Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) getters и setters методы.

package HW09042021;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("Volvo");
        Car car1 = new Car("Nissan");
        Car car2 = new Car("Opel");
        try {
            car.start();
            car1.start();
            car2.start();
        } catch (CarException e) {
            System.out.println("Число является четным");
        }
        System.out.println("Программа - finish");
    }
}
