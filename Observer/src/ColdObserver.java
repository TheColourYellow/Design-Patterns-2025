public class ColdObserver implements Observer {

    private WeatherStation ws;

    public ColdObserver(WeatherStation station) {
        ws = station;
        ws.addObserver(this);

    }

    @Override
    public void update() {
        if (ws.getTemperature() < 0) {
            System.out.println("Temperature is now cold: " + ws.getTemperature());
        }

    }
}
