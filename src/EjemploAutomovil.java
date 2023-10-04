public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil("2025");
        System.out.println("auto.fabricante = " + auto.getFabricante());
        auto.setFabricante("Nissan");
        System.out.println("auto.fabricante = " + auto.getFabricante());
        System.out.println("auto.precio = " + auto.getPrice());
        System.out.println(auto.velocidad(auto.getFabricante()));

        Automovil auto2 = new Automovil("2025", Color.VERDE);
        System.out.println("Auto dos y auto uno = " + auto2.equals(auto));
        System.out.println("Color " + auto2.getColor().getColor());
    }
}
