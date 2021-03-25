package my.transport;

public class Military extends Aerial {
    private boolean ejectionSystem;
    private int numberMissiles;

    public Military(double output, double maxSpeed, double weight, String brand, double wingSize, double minRunwayLength, boolean ejectionSystem, int numberMissiles) {
        super(output, maxSpeed, weight, brand, wingSize, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberMissiles = numberMissiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberMissiles() {
        return numberMissiles;
    }

    public void setNumberMissiles(int numberMissiles) {
        this.numberMissiles = numberMissiles;
    }


    @Override
    public void displayInfo() {
        System.out.println("Military{" +
                "wingSize=" + wingSize +
                ", minRunwayLength=" + minRunwayLength +
                ", ejectionSystem=" + ejectionSystem +
                ", numberMissiles=" + numberMissiles +
                ", output=" + output +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}');
    }

    //Для Военных самолётов необходимо сделать метод выстрел, в котором должна быть проверка:
    // если количество ракет не равно 0, то в консоль выводится сообщение "Ракета пошла", если 0 - "Боеприпасы отсутствуют".

    public void shoot() {
        if (numberMissiles > 0) {
            System.out.println("Ракета пошла");
            numberMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    //Реализовать метод катапультирование, который проверит - если наличие системы катапультирования true,
    // то выводим "Катапультирование прошло успешно", если false - "У Вас нет такой системы".
    public void existCatapult() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У Вас нет системы катапультирования");
        }
    }
}
