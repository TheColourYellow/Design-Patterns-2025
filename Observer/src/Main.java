public class Main {
    public static void main(String[] args) {

        int startTemp = (int) (Math.random() * 10);

        WeatherStation ws = new WeatherStation(startTemp);
        ChangeObserver chO = new ChangeObserver(ws);
        HeatObserver hO = new HeatObserver(ws);
        ColdObserver cO = new ColdObserver(ws);

        Thread t = new Thread(ws);
        t.start();

        //This demonstration of observer removal only works if the loop has a functional task
        //In this case vomiting out print lines
        /*
        do {
            System.out.println(ws.getCounter());
        } while (ws.getCounter() < 3);
        ws.removeObserver(chO);
*/
    }
}
