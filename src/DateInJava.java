import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInJava {
    public static void main(String[] args) {
        //Date es el objeto estandar de Java y es para fechas

        //Forma de instanciar
        Date fechaActual = new Date();

        System.out.println("fechaActual = " + fechaActual);

        //Geenera un formato para la fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMMM/yyyy");

        String formatDate = formato.format(fechaActual);
        System.out.println("fechaFormato = " + formatDate);
    }
}
