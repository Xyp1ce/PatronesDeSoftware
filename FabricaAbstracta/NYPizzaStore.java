public class NYPizzaStore extends PizzaStore {

  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    // La tienda de NY crea su propia fábrica de ingredientes [cite: 838]
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if (item.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory); // Se le pasa la fábrica [cite: 843]
      pizza.setName("New York Style Cheese Pizza");
    } else if (item.equals("veggie")) {
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");
    } else if (item.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");
    } else if (item.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("New York Style Pepperoni Pizza");
    }
    return pizza;
  }
}
