package by.teachmeskills.robot;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Robot> robots;

    public Shop(List<Robot> robots) {
        this.robots = robots;
    }

    public void maxPrice() {

        int max = this.robots.get(0).getPrice();
        String nameMax = this.robots.get(0).getName();
        for (Robot robot : this.robots) {
            if (robot.getPrice() > max) {
                max = robot.getPrice();
                nameMax = robot.getName();
            }
        }
        System.out.println("Max price\t" + nameMax);
    }

    public void addShop(Robot robot) {
        this.robots.add(robot);
    }
}
