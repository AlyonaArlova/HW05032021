package my.transport;

public class Cargo extends Terrestrial {
    private double liftingCapacity;

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public Cargo(double output, double maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption, double liftingCapacity) {
        super(output, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.liftingCapacity = liftingCapacity;

    }


    @Override
    public void displayInfo() {
        System.out.println("Cargo{" +
                "liftingCapacity=" + liftingCapacity +
                ", wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", output=" + output +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}');

    }
    //Для Грузового разработать метод, который проверит, можно ли загрузить в автомобиль xxx груза.
    //Метод должен проверять: если это количество груза помещается в грузовик, то в консоль должно выводиться сообщение
    // "Грузовик загружен". Если количество груза, которое нужно поместить в грузовик,
    // больше, чем вместимость грузовика, то должно выводиться сообщение "Вам нужен грузовик побольше".
    public void inputBox(int box) {
        if (liftingCapacity >= box) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}




