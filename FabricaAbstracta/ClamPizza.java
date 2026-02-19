public class ClamPizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;

  // El constructor recibe la fábrica y la guarda
  public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  // El método prepare le pide a la fábrica los ingredientes necesarios
  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam(); // La fábrica decide si son frescas o congeladas
  }
}
