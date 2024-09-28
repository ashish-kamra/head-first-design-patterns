package chapter3.beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}
