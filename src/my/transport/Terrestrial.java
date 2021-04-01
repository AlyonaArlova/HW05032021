package my.transport;

public abstract class Terrestrial extends Transport {
    protected int wheelsNumber;
    protected double fuelConsumption;

    public Terrestrial(double output, double maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption) {
        super(output, maxSpeed, weight, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

}

