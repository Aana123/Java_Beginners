import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String str = new String("Aana");
        System.out.println(str);
        String name = "gold";
        System.out.println(name);
        int a = 6;
        float b = 6.45f;
        System.out.printf("The value of a is %d and value of b is %f " , a, b);
        //%d -> for int and %f for float

        System.out.printf("The value of a is %d and value of b is %7.3f " , a, b);
        // 7 is the number of spaces that the output is taking and
        // .3 is the number of digits it will show after the decimal

        System.out.format("The value of a is %d and value of b is %f " , a, b);
        //both the above statements give same output

        // for  reading a word
        //System.out.println("Enter a word: ");
        Scanner cs = new Scanner(System.in);
        //String st = cs.next();
        //System.out.println(st);

        //for reading the entire line
        System.out.println("Enter a line: ");
        String li = cs.nextLine();
        System.out.println(li);
    }
}
