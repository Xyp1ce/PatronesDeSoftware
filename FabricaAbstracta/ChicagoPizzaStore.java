public class ChicagoPizzaStore extends PizzaStore {

  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    // Chicago usa sus propios proveedores regionales [cite: 1015]
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    if (item.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style Deep Dish Cheese Pizza");
    } else if (item.equals("veggie")) {
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("Chicago Style Veggie Pizza");
    } else if (item.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("Chicago Style Clam Pizza");
    } else if (item.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("Chicago Style Pepperoni Pizza");
    }
    return pizza;
  }
}
