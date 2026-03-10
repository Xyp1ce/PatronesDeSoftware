package Classes;

public class TV {
  String name;

  public TV(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Encendida");
  }

  public void off() {
    System.out.println(name + " Apagada");
  }
}
