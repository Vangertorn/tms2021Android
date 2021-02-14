package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Robot android = new Robot(new SonyHead(10), new SonyHand(10), new SonyLeg(10), "Android");
        android.action();
        Robot bender = new Robot(new SamsungHead(20), new ToshibaHand(2), new SamsungLeg(10), "Bender");
        bender.action();
        Robot bostonDynamic = new Robot(new ToshibaHead(4), new SonyHand(3), new SamsungLeg(30), "Boston Dynamic");
        bostonDynamic.action();
        Shop shop1 = new Shop(new LinkedList<>());
        shop1.addShop(android);
        shop1.addShop(bender);
        shop1.addShop(bostonDynamic);
        shop1.maxPrice();




        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
