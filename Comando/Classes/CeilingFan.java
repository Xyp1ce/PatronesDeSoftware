package Classes;

public class CeilingFan {
  String name;
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;
  int speed;

  public CeilingFan(String name) {
    this.name = name;
    speed = OFF;
  }

  public void high() {
    speed = HIGH;
  }

  public void medium() {
    speed = MEDIUM;
  }

  public void low() {
    speed = LOW;
  }

  public int getSpeed() {
    return speed;
  }

  public void off() {
    System.out.println("Ventilador de " + name + " Apagado");
  }
}
