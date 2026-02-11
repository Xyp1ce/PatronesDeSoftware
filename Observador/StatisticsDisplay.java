// This display shows the avg, min and max temperature

public class StatisticsDisplay implements Observer, DisplayElement {
  private float min = 200f;
  private float max = 0f;
  private float tempSum = 0;
  private int numReadings = 0;
  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    tempSum += temperature;
    numReadings++;
    // Looking if the temperature is greater or lower
    if (temperature > max)
      max = temperature;
    if (temperature < min)
      min = temperature;
    display();
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature  = " + (tempSum / numReadings) + "/ " + max + "/ " + min);
  }
}
