public class Matrices {
    public static void main(String[] args) {
        int [][] numeros = new int[2][4];
        System.out.println("numero de columnas de la matriz = " + numeros.length);

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        System.out.println("numeros[0][2] = " + numeros[0][2]);
    }
}
