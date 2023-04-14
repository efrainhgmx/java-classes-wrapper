import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        //System nos permite acceder a varias propiedades del sistema en donde esta el corriendo Java
        
        String userPc = System.getProperty("user.name");
        System.out.println("userPc = " + userPc);
        
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        //Listar todas las propiedades

        Properties myProperties = System.getProperties();

        myProperties.list(System.out);
    }
}
