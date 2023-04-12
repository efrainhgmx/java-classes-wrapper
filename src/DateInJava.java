import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInJava {
    public static void main(String[] args) {
        //Date es el objeto estandar de Java y es para fechas

        //Forma de instanciar
        Date fechaActual = new Date();

        System.out.println("fechaActual = " + fechaActual);

        //Genera un formato para la fecha

        //11/04/2023
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MMMM/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd - MMMM - yyyy");
        SimpleDateFormat formato3 = new SimpleDateFormat("'fecha' dd/MMMM/yy");
        //Fecha:  11/abril/23 hora:  10:24:18
        SimpleDateFormat formato4 = new SimpleDateFormat("'Fecha: ' dd/MMMM/yy 'hora: ' hh:mm:ss");

        //martes 11/abril/23 hora:  10:25:13
        SimpleDateFormat formato = new SimpleDateFormat("EEEE dd/MMMM/yy 'hora: ' hh:mm:ss");

        //Get time devuelve el tiempo transcurrido en milisegundos desde Enero 1 de 1970
        System.out.println(" Get time= " +  fechaActual.getTime());



        String formatDate = formato.format(fechaActual);
        System.out.println("fechaFormato = " + formatDate);
    }
}
