public class MathClass {
    public static void main(String[] args) {
        //Calcular valor absoluto e un numero
        int absoluto  = Math.abs(-3); // 3

        //Máximo entre 2 numeros
        double max  = Math.max(3.5, 1.2); // 3.5

        //mínimo entre 2 números
        double min  = Math.max(3.5, 1.2); //1.2

        double roundUp = Math.ceil(2.86);
        double roundDown = Math.floor(2.1);

        double round = Math.round(4.75);

        //2.718281...
        double exp = Math.exp(1);

        //Logaritmo Natural
        double log = Math.log(10);

        //Calcular potencia 5 a la 3
        double potencia = Math.pow(5,3);

        //Raiz cuadrada de 5
        double raiz = Math.sqrt(5);

        //FUNCIONES TRIGONOMÉTRICAS

        //De radianes a grados
        double grados = Math.toDegrees(1.57); //90°

        //De grados a radianes
        double radianes = Math.toRadians(90d); //1.57...

        //Seno SIMPRE EN RADIANES
        double seno90 = Math.sin(radianes);
        double coseno90 = Math.cos(radianes);


        //RANDOM
        double random = Math.random();

        //Regresa un valor aleatorio entre el 0 y el 7;
        random *= 7;

        String[] colores = {"rojo", "verde", "azul", "amarillo"};

        double colorAlaeatorio = Math.random();
        colorAlaeatorio *= colores.length;
        //Excluye el indice 4 para que sean solo valores del 0 a 3
        colorAlaeatorio = Math.floor(colorAlaeatorio);


    }
}
