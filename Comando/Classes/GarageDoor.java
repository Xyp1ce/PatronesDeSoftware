package Classes;

public class GarageDoor {

  String name;

  public GarageDoor(String name) {
    this.name = name;
  }

  public void up() {
    System.out.println(name + " Puerta arriba");
  }

  public void down() {
    System.out.println(name + " Puerta abajo");
  }

  public void stop() {
    System.out.println(name + " Pueta detenida");
  }

  public void lighOn() {
    System.out.println(name + " Luces prendidas");
  }

  public void lightOff() {
    System.out.println(name + " Luces apagadas");
  }
}
