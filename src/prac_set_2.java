import java.util.Scanner;

public class prac_set_2 {
    public static void main(String[] args) {
        //1. evaluate the expression
        float g = 7/4f*9/2f;
        System.out.println(g);

        //2. encrypt and decrypt a grade by 8
        char grade = 'B';
        grade =(char) (grade + 8);
        System.out.println(grade); //encrypting using typecasting

        //decrypting the grade
        grade =(char) (grade - 8);
        System.out.println(grade);

        //3. whether a given number is greater than a given number
        Scanner cs = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int a = cs.nextInt();
        System.out.println(a>8);

        //4. write the following expression
        int v= 50;
        int u= 0;
        int s= 5;
        int i = (v*v - u*u)/2*a*s;
        System.out.println(i);

        //5. find the value of the following expression
        int x = 7;
        int r = 7*49/7 + 35/7;
        System.out.println(r);









    }
}
