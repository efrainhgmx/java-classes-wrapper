public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        System.out.println("auto.fabricante = " + auto.fabricante);
        auto.fabricante = "Nissan";
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.precio = " + auto.precio);
        auto.precio = 250_000;
        System.out.println("auto.precio = " + auto.precio);

    }
}
