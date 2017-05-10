
package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza p = null;
    PizzaIngredientFactory infac = new NYPizzaIngredientFactory();
    if(type.equals("cheese")){
      p=new CheesePizza(infac);
    }
    return p;
  }
}