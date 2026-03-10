package Classes;

public class Hottub {
  String name;

  public Hottub(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Se esta calentando a 30 grados");
  }

  public void ready() {
    System.out.println(name + " Esta burbujeando!!");
  }

  public void off() {
    System.out.println(name + " Se esta enfriando a 18 grados");
  }
}
