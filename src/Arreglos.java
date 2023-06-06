import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {


        /**
         * ?La manera más facil simple de crear una arreglo
         *
         * */
        int[] numeros =  new int[4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        char[] letters = {'A', 'B', 'C' , 'D'};

        for(int i = 0; i < letters.length; i++) {
            System.out.println("Letters = " + letters[i]);
        }
        
        
        /**
         * *Ordernar  arreglos usando sort
         *
         * */
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

        String nombre, apellido, profesion;
        nombre = users[0];
        apellido = "Perez";
        profesion = "Desarrollador";


        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("profesion = " + profesion);
    }
}
