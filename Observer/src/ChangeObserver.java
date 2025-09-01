public class ChangeObserver implements Observer {

    private WeatherStation ws;

    public ChangeObserver(WeatherStation station) {
        ws = station;
        ws.addObserver(this);

    }

    @Override
    public void update() {
        if (ws.getTemperature() != 0) {
            System.out.println("Temperature has changed to: " + ws.getTemperature());
        }

    }
}
