import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromCustomProperties {
    public static void main(String[] args) {
        try {
            //Crea un archivo para leer
            FileInputStream file = new FileInputStream("src/properties/config.properties");
            //Crea unas propiedades para no mutar sobre system
            Properties prop = new Properties(System.getProperties());


            //Carga configuraciones
            prop.load(file);

            prop.list(System.out);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
