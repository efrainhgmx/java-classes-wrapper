import java.io.IOException;

public class EjecutarProgramaSO {
    public static void main(String[] args) {

        //Nos permite ejecutar aplicaciones del sistema operativo
        Runtime rt = Runtime.getRuntime();

        Process process;
        //Evalua el sistema operativo
        try {
            //linux o nix -> mac
            if(System.getProperty("os.name").startsWith("Windows")) {
                //Abre el note pad o bloc de notas
                process = rt.exec("notepad");
            } else {
                process =  rt.exec("gedit");
            }
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Comando desconocido a ejecutar: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Cerramos el editor");
    }
}
