import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa el radio del circulo: ");
            double radio = scanner.nextDouble();
            double areaCirculo = Math.PI * Math.pow(radio, 2);
            System.out.println("Area del circulo es: " + areaCirculo);
        }catch (Exception e) {
            System.err.println("No fue posible realizar el caculo");
            System.exit(1);
        }
    }
}
