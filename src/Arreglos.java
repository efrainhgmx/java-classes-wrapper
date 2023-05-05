import java.util.Arrays;

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
        
        
        //Ordenar arreglos
        String[] users = {"Carlos", "Maria", "Angela"};
        Arrays.sort(users);

        for(String user:
             users) {
            System.out.println("user = " + user);
        }
        
        int[] precios = new int[5];
        precios[0] = 25;
        precios[1] = 1;
        precios[2] = 0;
        precios[3] = -12;
        precios[4] = 22;
        
        Arrays.sort(precios);

        for (int precio:
             precios) {
            System.out.println("precio = " + precio);
        }
    }
}
