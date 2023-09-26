public class Automovil {
    //* Propiedades o atributos de la clase Automovil
    private String fabricante;
    private String modelo;
    private String marca;
    private String color;
    private final static double precio = 125_000;

    //*Constructor
    public Automovil(String modelo){
        this.modelo = modelo;
    }

    public Automovil(String modelo, String color) {
        this(modelo);
        this.color = color;
    }


    public double getPrice() {
        return precio;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public void seePrice() {
        System.out.println("Precio = " + precio);
    }

    public String velocidad(String marca) {
        return marca + " " + "320km/h";
    }
}
