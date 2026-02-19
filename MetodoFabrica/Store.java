public class Store {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chPizzaStore = new ChicagoPizzaStore();
    nyPizzaStore.orderPizza("clam");
    chPizzaStore.orderPizza("cheese");
  }
}
