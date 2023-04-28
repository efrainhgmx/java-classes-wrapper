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

        //Ideal para mostrar errores
        System.err.println("Mensaje de error");

        //Muestra code para saber si es un error puede ser 1 o -1
        System.exit(-1);

        //Llama al garbage collector de manera explicita
        System.gc();
    }
}
