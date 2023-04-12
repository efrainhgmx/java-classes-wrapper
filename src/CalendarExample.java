import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(Calendar.YEAR, Calendar.JULY,Calendar.DATE);

        System.out.println("calendario.getTime() = " + calendario.getTime());
    }
}
