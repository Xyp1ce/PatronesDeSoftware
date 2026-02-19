public abstract class PizzaStore {

  // El método orderPizza no cambia, es el marco de trabajo [cite: 236-242]
  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type); // Este es el "Factory Method" [cite: 239]

    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  // Cada tienda regional implementará esto [cite: 248]
  protected abstract Pizza createPizza(String item);
}
