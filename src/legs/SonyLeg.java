package legs;

import legs.ILeg;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
