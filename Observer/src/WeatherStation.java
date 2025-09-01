import java.util.ArrayList;

public class WeatherStation extends Observable implements Runnable {

    private int temperature;
    private int maxTemp = 50;
    private int minTemp = -40;

    private int counter;
    private int limit = 20;

    public WeatherStation(int temperature) {
        this.temperature = temperature;

    }

    @Override
    public void run() {
        do {
            double randomTemp = Math.random();
            if (randomTemp < 0.8) {
                if (temperature == minTemp) {
                    System.out.println("Can't get any colder");
                }
                else temperature--;}
            else {
                if (temperature == maxTemp) {
                    System.out.println("Can't get any warmer");
                }
                else temperature++;}

            notifyObservers();
            counter++;

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (counter < limit);
    }

    public int getTemperature() {
        return temperature;
    }

    public int  getCounter() {return counter;}
}
