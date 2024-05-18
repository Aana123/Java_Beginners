import java.util.Scanner;

public class prac_set_5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Q.1");
        //1. Wap to print the pattern (that one :( )
        for (int i = 4; i > 0; i--) {
            if (i == 4) {
                System.out.println("****");
            } else if (i == 3) {
                System.out.println("***");
            } else if (i == 2) {
                System.out.println("**");
            } else if (i == 1) {
                System.out.println("*");
            }
        }

        System.out.println("");
        System.out.println("Q.2");

        //2. Wap to add first n even numbers using while loop
        System.out.println("Enter n:");
        int n = cs.nextInt();
        int sum = 0;
        int a = 0;
        while(a<=2*n){
            if(a%2==0){
                sum=sum+a;
            }
            a++;
        }
        System.out.print("The sum of first "+ n +" even numbers using while loop is: ");
        System.out.println(sum);

        System.out.println("");
        System.out.println("Q.3");

        //3. Wap to print multiplication table of a given number n
        System.out.println("Enter m:");
        int m = cs.nextInt();
        System.out.println("The table of "+m+" is:");
        for(int p = 1;p<=10;p++){
            int l = m*p;
            System.out.println(m+" x "+p+" = "+l);
        }

        System.out.println("");
        System.out.println("Q.4");

        //4. Wap to print multiplication table of 10 in reverse order
        System.out.println("The table of 10 in reverse order is:");
        for(int h = 10; h>0;h--){
            //System.out.println("10 times "+h+" is = "+ (h*10));
            //tareekeey
            System.out.printf("%d x %d = %d\n",10,h,(h*10));
        }

        System.out.println("");
        System.out.println("Q.5");

        //5. Wap to find the factorial of a given number using for loops
        System.out.println("Enter g:");
        int g = cs.nextInt();
        int ok = 1;
        for(int y = 1;y<=g;y++){
            ok *=y;
        }
        System.out.println(g+" factorial using for loops is:");
        System.out.println(ok);

        System.out.println("");
        System.out.println("Q.6");

        //6. Wap to find the factorial of a given number using while loops
        System.out.println("Enter f:");
        int f = cs.nextInt();
        int t = 1;
        int fact = 1;
        while(t<=f){
            fact *= t;
            t++;
        }
        System.out.println(f+" factorial using while loop is: ");
        System.out.println(fact);

        System.out.println("");
        System.out.println("Q.7");

        //7. Wap to find the sum of table of 8
        int s = 0;
        for(int r= 1;r<=10;r++){
            int j = r*8;
            s=s+j;
        }
        System.out.println("The sum of table of 8 is:");
        System.out.println(s);

        System.out.println("");
        System.out.println("Q.8");

        //8. Wap to add first n even numbers using for loop
        System.out.println("Enter z:");
        int z = cs.nextInt();
        int sum1 = 0;
        for(int v = 1;v<=(2*z);v++){
            if(v%2==0) {
                sum1+=v;
            }
        }
        System.out.println("The sum of n even numbers using for loop is: ");
        System.out.println(sum1);
    }
}