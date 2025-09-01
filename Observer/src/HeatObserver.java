public class HeatObserver implements Observer {

    private WeatherStation ws;

    public HeatObserver(WeatherStation station) {
        ws = station;
        ws.addObserver(this);

    }

    @Override
    public void update() {
        if (ws.getTemperature() >= 15) {
            System.out.println("Temperature is now warm: " + ws.getTemperature());
        }

    }
}
