import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendarToAdapt = Calendar.getInstance();
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter(calendarToAdapt);

        adapter.setDay(1);
        adapter.setMonth(11);
        adapter.setYear(2000);
        System.out.println(adapter.getDay());
        System.out.println(adapter.getMonth());
        System.out.println(adapter.getYear());
        adapter.advanceDays(365);
        System.out.println(adapter.getDay() + "." + adapter.getMonth() + "." + adapter.getYear());
        System.out.println("Actual date: " + Calendar.getInstance().getTime());
    }
}
