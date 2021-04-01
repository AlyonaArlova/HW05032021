package my.transport;

public class Passenger extends Terrestrial {
    private String bodyType;
    private int passengerNumber;


    public Passenger(double output, double maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption, String bodyType, int passengerNumber) {
        super(output, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }


    @Override
    public void displayInfo() {
        System.out.println("Passenger{" +
                "bodyType='" + bodyType + '\'' +
                ", passengerNumber=" + passengerNumber +
                ", wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", output=" + output +
                ", maxSpeed=" + maxSpeed +
                ", мощность в киловаттах (кВ)" + output * 0.74 +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}');
    }
    //Для Легкового разработать метод, который будет принимать время и считать сколько километров проедет
    // машина двигаясь с максимальной скоростью и
    //сколько топлива она израсходует за это время.
    // Результат вывести в консоль. Расчет израсходованного топлива вынести в отдельный метод private.

    public void maxDistanceWithMaxSpeed(int min) {
        //s=V*t
        //За время <ваше введённое время> ч, автомобиль <марка автомобиля>,
        // двигаясь с максимальной скоростью <ваша максимальная скорость> км/ч проедет <xxx>
        // к и израсходует <xxx> литров топлива.
        double distance = maxSpeed * min / 60;
        wastedFuel(distance);
        System.out.println(" За время " + min / 60 + " ч, автомобиль " + brand + " , двигаясь с максимальной скоростью "
                + maxSpeed + " км/ч проедет " + distance + " к и израсходует " + wastedFuel(distance) + " литров топлива. ");

    }

    private double wastedFuel(double distance) {
        // s / 100 km* fuel consum
        return distance / 100 * fuelConsumption;

    }
}
