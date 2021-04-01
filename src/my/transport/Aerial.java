package my.transport;

public abstract class Aerial extends Transport {
    protected double wingSize;
    protected double minRunwayLength;

    public Aerial(double output, double maxSpeed, double weight, String brand, double wingSize, double minRunwayLength) {
        super(output, maxSpeed, weight, brand);
        this.wingSize = wingSize;
        this.minRunwayLength = minRunwayLength;
    }
}
