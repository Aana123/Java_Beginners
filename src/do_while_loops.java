import java.util.Scanner;

public class do_while_loops {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int a =cs.nextInt();                      // while- pehle ticket dikhaophir cinema mein entry jabki
                                                  // do while mein- pehle ghus jaao baad mein chk(bach jate ho)
        do{                                       // it is guaranteed to execute atleast once!!
            System.out.println(a);
            a++;
        }while(a<5);


        //Quick Quiz
        //print first n numbers
        int c = 0;
        System.out.println("Enter ending number: ");
        int b = cs.nextInt();
        do{
            System.out.println(c);
            c++;
        }while(c<=b);
    }
}
