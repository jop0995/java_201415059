package headfirst.strategy;

public abstract class Duck {
 protected FlyBehavior flyBehavior;
 //QuackBehavior quackBehavior;
 public Duck() {
 }
 public void setFlyBehavior (FlyBehavior fb) {
  flyBehavior = fb;
 }
 abstract void display();
 public void performFly() {
  flyBehavior.fly();
 }
 public void swim() {
  System.out.println("All ducks float, even decoys!");
 }
}