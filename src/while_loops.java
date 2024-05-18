import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = cs.nextInt();
        while(i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("Finished running while loops!!");

        //Quick Quiz
        //print natural numbers from 100 to 200
        int a = 100;
        while(a<=200){
            System.out.println(a);
            a++;
        }
    }

}
