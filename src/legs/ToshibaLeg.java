package legs;

import legs.ILeg;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
