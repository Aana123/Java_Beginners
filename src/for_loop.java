import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a number: ");
        for(int i = cs.nextInt(); i<=10; i++){
            System.out.println(i);
        }

        //Quick Quiz
        //print first n odd numbers
        System.out.println("Enter n: ");
        int e = cs.nextInt();
        System.out.println("First "+e+" odd numbers are: ");            // 2n = even no.s , 2n+1 = odd no.s
        for(int a = 0 ; a<=e ; a++){
            System.out.println((2*a)+1);
        }

        //Decrementing for loops
        System.out.println("Decrementing for loop goes as: ");
        for(int t = 7 ; t!=0; t--){
            System.out.println(t);
        }

        //Quick Quiz
        //print n natural numbers in reverse order
        //System.out.println("Here are "+r+" natural numbers in reverse order: ");
        System.out.println("Enter r: ");
        for(int r = cs.nextInt();r>0;r--){
            System.out.println(r);
        }
    }
}
