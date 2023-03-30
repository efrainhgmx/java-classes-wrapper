public class WrapperBoolean {
    public static void main(String[] args) {
        //Los valores boolean funcionan muy similar al wrapper integer
        boolean activo =  1 < 2;

        //La manera de generarlo es con valueOf
        Boolean activoWrapper = Boolean.valueOf("true");
        Boolean esTrue = Boolean.valueOf(10 == 10);

        System.out.println("esTrue = " + esTrue);
        System.out.println("activoWrapper = " + activoWrapper);
        
        //getClass nos permite ver como es que está construida la clase
        
        Integer num = 25;
        Class intClass = num.getClass();

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getName() = " + intClass.getPackage().getName());
        System.out.println("intClass.getName() = " + intClass.getSuperclass().getName());
        System.out.println("intClass.getName() = " + intClass.getSuperclass().getSuperclass().getName());

    }
}
