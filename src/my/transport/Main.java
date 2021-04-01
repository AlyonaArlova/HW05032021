package my.transport;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(130, 130, 1000, "Volvo", 4, 15, "Coupe", 5);
        Cargo cargo = new Cargo(150, 90, 1500, "VW", 8, 25, 300);
        Military military = new Military(2500, 150, 850, "Boing", 120, 200, false, 2);
        passenger.displayInfo();
        passenger.maxDistanceWithMaxSpeed(36000);
        cargo.inputBox(100);
        cargo.inputBox(1000);
        military.existCatapult();
        military.shoot();
        military.shoot();
        military.shoot();


    }
}
