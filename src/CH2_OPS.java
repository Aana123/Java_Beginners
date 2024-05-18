import org.w3c.dom.ls.LSOutput;

public class CH2_OPS {
    public static void main(String[] args) {
        //arithematic operators
        int a = 4;
        System.out.println(4.8%2); // --> returns decimal remainder
        //assignment operators
        int b = 8+a;
        System.out.println("The value is: " + b);
        b += 89;
        System.out.println(b);
        //comparison operator
        System.out.println(9==8);
        //logical operators
        System.out.println(67>8 && 89>9); //and operator
        System.out.println(87>9 || 89>95); //or operator
        //bitwise operators
        System.out.println(2&3);
        System.out.println(2|4);
    }

}
