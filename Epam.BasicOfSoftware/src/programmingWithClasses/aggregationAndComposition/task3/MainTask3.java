package programmingWithClasses.aggregationAndComposition.task3;

import java.util.LinkedList;

public class MainTask3 {
    public static void main(String[] args) {
        Town town = new Town("Vitebsk",400);
        Town town1 = new Town("Minsk", 1000);
        Town town2 = new Town("Mogilev", 350);
        Town town3 = new Town("Gomel", 500);
        Town town4 = new Town("Grodno", 300);
        Town town5 = new Town("Brest", 300);
        District district = new District("Vitebks",new Town[]{town});
        District district1 = new District("Minsks",new Town[]{town1});
        District district2 = new District("Mogilevs",new Town[]{town2});
        District district3 = new District("Gomels",new Town[]{town3});
        District district4 = new District("Grodnos",new Town[]{town4});
        District district5 = new District("Brests",new Town[]{town5});
        Area area = new Area("Vit", new District[]{district});
        Area area1 = new Area("Min", new District[]{district1});
        Area area2 = new Area("Mog", new District[]{district2});
        Area area3 = new Area("Gom", new District[]{district3});
        Area area4 = new Area("Grod", new District[]{district4});
        Area area5 = new Area("Br", new District[]{district5});
        State state = new State("Belarus",new Area[]{area,area1,area2,area3,area4,area5});
        state.capitalState();
        state.squareState();
        state.numberArea();
        state.capitalAreaAll();


    }
}
