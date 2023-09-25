public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        System.out.println("auto.fabricante = " + auto.fabricante);
        auto.fabricante = "Nissan";
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.precio = " + auto.precio);

        System.out.println(auto.velocidad(auto.fabricante));
    }
}
