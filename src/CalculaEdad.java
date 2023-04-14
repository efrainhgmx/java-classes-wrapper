import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculaEdad {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

        String formato  = "yyyy-MM-dd";

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        try {
            Date fechaNacimiento = dateFormat.parse(fechaStr);
            Date actual = new Date();

            // creamos un patron de fecha numérico con el año mes y día
            dateFormat = new SimpleDateFormat("yyyyMMdd");

            // luego convertimos ambas fechas la actual y la fecha de nacimiento
            // en enteros que contiene el año mes y día
            int nacimiento = Integer.parseInt(dateFormat.format(fechaNacimiento));
            int hoy = Integer.parseInt(dateFormat.format(actual));

            // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
            // dejar la fecha en decenas o centenas
            int edad = (hoy - nacimiento) / 10000;
            System.out.println("Tu edad es: " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
