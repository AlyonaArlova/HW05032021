public class program_computer {

    public static void main(String[] args) {

        Computer test = new Computer();
        test.displayInfo();

        Computer test1 = new Computer("Pentium", 4, 120);
        test1.displayInfo();
    }
}

class Computer {

    String processorType;    // тип процессора
    int ramSize;        // объем оперативной памяти
    int hddSize;        // объем жесткого диска
    boolean power = false;

    /*начало блока инициализатора*/ {
        processorType = "Pentium Pro";
        ramSize = 8;
        hddSize = 80;
    }
    public void switchOn() {
        power = true;
    }

    public void switchOff() {
        power = false;
    }

    /*конец блока инициализатора*/
    Computer() {

    }

    Computer(String processorType, int ramSize, int hddSize) {

        this.processorType = processorType;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
    }

    void displayInfo() {
        System.out.printf("Processor: %s \tRAM: %d \tHDD: %d\n", processorType, ramSize, hddSize);
    }
}
