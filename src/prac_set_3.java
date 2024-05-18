import java.util.Scanner;

public class prac_set_3 {
    public static void main(String[] args) {
        //1. string toLowerCase
        String str = "Happy";
        System.out.println(str.toLowerCase());

        //2. replace spaces with underscores
        String k = "p o p";
        System.out.println(k.replace( " ","_"));

        //3. fill letter template
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter name: ");
        String t = cs.next();
        System.out.println("Dear "+t+",Thanks a lot.");
        //zem ( meine butter :) )
        String y = "Dear <|name|>, Thanks a lot.";
        System.out.println(y.replace("<|name|>","Aana"));
        //4. to detect double and triple spaces
        String r = "  helo  hi   ok  ";
        System.out.print("The number of triple spaces is: ");
        System.out.println(r.indexOf("   "));
        System.out.print("The number of double spaces is: ");
        System.out.println(r.indexOf("  "));

        //5. format the letter using escape sequence
        String letter = "Dear Aana,\n\tYou are amazing! \n\tThanks.";
        System.out.println(letter);
    }
}
