import java.util.Calendar;

public class CalendarToNewDateAdapter implements NewDateInterface{

    //Calendar calendar = Calendar.getInstance();
    Calendar calendar;

    public CalendarToNewDateAdapter(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void setDay(int day) {
        //calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        //calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
    }

    @Override
    public void setYear(int year) {
        //calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DATE);
    }

    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int day) {
        calendar.add(Calendar.DATE, day);
    }
}
