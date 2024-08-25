package chapter1;

import chapter1.fly.FlyBehavior;
import chapter1.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
