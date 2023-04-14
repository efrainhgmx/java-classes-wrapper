import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(Calendar.YEAR, Calendar.JULY,Calendar.DATE);

        System.out.println("calendario.getTime() = " + calendario.getTime());

        //Convertir una fecha a string
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formatDate.parse("25/07/1995");
            String fechaActual = fecha.toString();
            System.out.println("Fecha: ".concat(fechaActual));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
