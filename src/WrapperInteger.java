public class WrapperInteger {
    public static void main(String[] args) {
        System.out.println("Las clases Wrappers nos permiten envolver un valor y usar valores primitivos con ciertas funciones");
        Integer age = 35;
        int oneHundred = 100;
        Integer country = Integer.valueOf(oneHundred);

        //La manera de usar las clases como new Interger() esta deprecado

        //Tener cuidado porque lo siguiente puede tener perdida de información
        short shortNumber = age.shortValue();
        byte byteNumber = age.byteValue();

        System.out.println(byteNumber);

        //Comparar primitivos y Wrapper
        int a = 10;
        int b = 10;
        Integer c = 20;
        Integer d = 20;

        System.out.println(a == b); //true
        System.out.println(c == d); //false
    }
}