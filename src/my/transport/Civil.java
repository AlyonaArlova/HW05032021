package my.transport;

public class Civil extends Aerial {
    private int passengerCount;
    private boolean isBusinessClass;

    public Civil(double output, double maxSpeed, double weight, String brand, double wingSize, double minRunwayLength, int passengerCount, boolean isBusinessClass) {
        super(output, maxSpeed, weight, brand, wingSize, minRunwayLength);
        this.passengerCount = passengerCount;
        this.isBusinessClass = isBusinessClass;
    }

    public int getPassengerCount() {

        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }


    @Override
    public void displayInfo() {
        System.out.println("Civil{" +
                "passengerCount=" + passengerCount +
                ", isBusinessClass=" + isBusinessClass +
                ", output=" + output +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}');
    }
}
