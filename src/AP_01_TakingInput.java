//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class AP_01_TakingInput {
    public static void main(String[] args) {
            System.out.println("Taking Input from The user:");
            Scanner cs = new Scanner(System.in);
            //System.out.println("ENTER NUMBER 1: ");
            //int  a = cs.nextInt();
            //boolean b1 = cs.hasNextInt();
            //System.out.println(b1);
            //float a = cs.nextFloat();
            //System.out.println("ENTER NUMBER 2: ");
            //int  b = cs.nextInt();
            //float b = cs.nextFloat();
            //int sum = + b;
            //float sum = a + b ;
            //System.out.println("THE SUM OF THESE NUMBERS IS: ");
            //System.out.println(sum);

            String str =  cs.nextLine();
            System.out.println(str);
    }
}