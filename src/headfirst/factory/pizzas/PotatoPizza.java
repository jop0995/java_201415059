package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza{
  public PotatoPizza() {
    name="Potato Pizza";
    dough="Regular Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Potato");
    toppings.add("Pineapple");
    toppings.add("ShowerCream");
  }
}