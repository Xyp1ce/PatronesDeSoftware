// This display shows the forecast depending on the current pressure

public class ForecastDisplay implements Observer, DisplayElement {
  private float lastPressure = 0f;
  private float currentPressure = 0f;
  private String data;
  private Subject weatherData;

  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    currentPressure = pressure;
    // check if the value of the pressure is higher or lower
    if (currentPressure > lastPressure) {
      data = "Improving weather onthe way!";
    }
    if (currentPressure < lastPressure) {
      data = "Watch out for cooler, rainy weather";
    }
    if (lastPressure == currentPressure) {
      data = "More of the same";
    }
    lastPressure = currentPressure;
    display();
  }

  public void display() {
    System.out.println("Forecast: " + data);
  }
}
