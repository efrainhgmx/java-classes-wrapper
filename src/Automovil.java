public class Automovil {
    //* Propiedades o atributos de la clase Automovil
    private String fabricante;
    private String modelo;
    private String marca;
    private String color;
    private final static double precio = 125_000;



    public void seePrice() {
        System.out.println("Precio = " + precio);
    }

    public String velocidad(String marca) {
        return marca + " " + "320km/h";
    }
}
