public class Automovil {
    //* Propiedades o atributos de la clase Automovil
    private String fabricante;
    private String modelo;
    private String marca;
    private Color color;
    private final static double precio = 125_000;

    //*Constructor
    public Automovil(String modelo){
        this.modelo = modelo;
    }

    public Automovil(String modelo, Color color) {
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

    //*Sobre escribe el metodo de la clase padre
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
