import hands.SamsungHand;
import hands.ToshibaHand;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.SamsungLeg;
import legs.SonyLeg;
import legs.ToshibaLeg;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(100), new SamsungHand(100), new ToshibaLeg(700));
        Robot robot2 = new Robot(new ToshibaHead(100), new SamsungHand(100), new SonyLeg(100));
        Robot robot3 = new Robot(new SamsungHead(300), new ToshibaHand(400), new SamsungLeg(100));
        robot1.action();
        robot2.action();
        robot3.action();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Первый робот дороже");
        } else if (robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Второй робот дороже");
        } else {
            System.out.println("Третий робот дороже");
        }
    }
}
