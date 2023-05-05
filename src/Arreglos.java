public class Arreglos {
    public static void main(String[] args) {
        // La manera más facil simple de crear una arreglo

        int[] numeros =  new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        char[] letters = {'A', 'B', 'C' , 'D'};

        for(int i = 0; i < letters.length; i++) {
            System.out.println("Letters = " + letters[i]);
        }
    }
}
