package my.transport;

public abstract class Transport {
    protected double output;
    protected double maxSpeed;
    protected double weight;
    protected String brand;


    public Transport(double output, double maxSpeed, double weight, String brand) {
        this.output = output;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract void displayInfo();
}
