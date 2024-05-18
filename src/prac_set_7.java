import org.w3c.dom.ls.LSOutput;

public class prac_set_7 {
    static void table(int x){
        int b = 1 ;
        for(int a = 1;a<=10;a++){
            b = x*a;
            System.out.println(x+" x "+a+" = "+x*a);
        }
    }
//    static int pattern(int y,int...arr){
//        int c = y;
//        for(int d:arr){
//            c ="*".repeat();
//        }
//        return c;
//    }
    static void pattern(int y){
        for(int c = 1;c<=y;c++){
            System.out.println("*".repeat(c));
        }
    }
    static int sum(int d){
        //Base condition
        if(d==1){
            return 1;
        }
        else{
            return d + sum(d-1);
        }
    }
    static void patturn(int z){
        for(int g = z; g>0;g--){
            System.out.println("*".repeat(g));
        }
    }
    static int fib(int n){
        /*
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        */
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
     static int avg1(int ...arr){
         int avg = 0;
         int avk = 0;
         for(int o:arr){
             avg+=arr[o];
             avk=avg/(arr.length);
         }
         return avg;
    }
    public static void main(String[] args) {
        //1. Wap a method to print a table of number n
        System.out.println("Q.1");
        table(7) ;

        //2. Wap to print the following pattern (vhi purana wala)
        System.out.println("Q.2");
        pattern(4);

        //3. Write a recursive program to calc the sum of n natural numbers
        System.out.println("Q.3");
        int g = sum(9);
        System.out.println("Sum = "+g);

        //4. Wap to print the following pattern (vhi purane wale ka ulta)
        System.out.println("Q.4");
        patturn(9);

        //5. Wap to write the nth term of a fiboncci series using recursion
        System.out.println("Q.5");
        int fibbo = fib(7);
        System.out.println(fibbo);

        //6.  Wap to find the average of a number using varargs
        System.out.println("Q.6");
        int abg = avg1(8,9,67,34,31,23,23,12);
        System.out.println(abg);
    }
}
