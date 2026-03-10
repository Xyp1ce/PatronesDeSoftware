package Classes;

public class Stereo {

  String name;

  public Stereo(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Stereo encendido");
  }

  public void off() {
    System.out.println(name + " Stereo apagado");
  }

  public void setCD() {
    System.out.println(name + " CD ingresado");
  }

  public void setDvd() {
    System.out.println(name + " DVD ingresado");
  }

  public void setRadio() {
    System.out.println(name + " Radio puesta");
  }

  public void setVolume(int volume) {
    System.out.println("Volumen ajustado a " + volume);
  }
}
