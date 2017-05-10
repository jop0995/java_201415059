package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;
public abstract class Pizza {
  String name;
  Dough dough;
  Cheese cheese;
  ArrayList<String> toppings=new ArrayList<String>();
  protected abstract void prepare();
   
  public void bake() {
    System.out.println("baking " + name);
}
  public void cut() {
    System.out.println("cutting " + name);
  }
  public void box() {
    System.out.println("boxing " + name);
  }
}