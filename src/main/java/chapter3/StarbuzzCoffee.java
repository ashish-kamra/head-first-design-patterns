package chapter3;

import chapter3.beverage.Beverage;
import chapter3.beverage.DarkRoast;
import chapter3.beverage.Espresso;
import chapter3.beverage.HouseBlend;
import chapter3.condiment.Mocha;
import chapter3.condiment.Soy;
import chapter3.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        //Decorator Pattern
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.getCost());
    }
}
