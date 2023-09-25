public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        System.out.println("auto.fabricante = " + auto.getFabricante());
        auto.setFabricante("Nissan");
        System.out.println("auto.fabricante = " + auto.getFabricante());
        System.out.println("auto.precio = " + auto.getPrice());
        System.out.println(auto.velocidad(auto.getFabricante()));
    }
}
