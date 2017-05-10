package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory inFac;
  public CheesePizza(PizzaIngredientFactory inFac) {
  name = "NY Style Sauce and Cheese Pizza";
//  dough = "Thin Crust Dough";
//  sauce = "Marinara Pizza Sauce";
//  toppings.add("Grated Reggiano Cheese");
  this.inFac=inFac;
  }
  public void prepare() {
    dough=inFac.createDough();
    cheese=inFac.createCheese();
  }
}
  