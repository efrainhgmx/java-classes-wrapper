public class MatricesString {
    public static void main(String[] args) {
        //3 rows and 2 columns
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Juan";
        nombres[0][1] = "Perez";

        nombres[1][0] = "Maria";
        nombres[1][1] = "Martinez";

        nombres[2][0] = "Pedro";
        nombres[2][1] = "Gomez";

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; j++){
                System.out.println(nombres[i][j]);
            }
        }

        String[][] names = {
                {"Juan", "Perez"},
                {"Maria", "Martinez"},
                {"Pedro", "Gomez"}
        };

        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }

    }
}
