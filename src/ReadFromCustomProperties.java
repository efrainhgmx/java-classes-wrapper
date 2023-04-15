import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromCustomProperties {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/properties/config.properties");
            Properties prop = new Properties(System.getProperties());

            prop.load(file);

            prop.list(System.out);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
