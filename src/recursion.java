public class recursion {
    //factorial(0) = 1 (Nv sor :) -> aanko mein chamak hehe)
    //factorial(n) = n * n-1 * n-2 *.....* 1
    //factorial(5)= 5*4*3*2*1 = 120
    //factorial(n) = n * factorial(n-1)
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);            //apne aap ko call kr liya -> recursion
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int pro = 1;
            for(int j = 1;j<=n;j++){
                pro*=j;
            }
            return pro;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of 5 factorial using recursive approach is: "+factorial(x));
        System.out.println("The value of 5 factorial using iterative approach 1 is: "+factorial_iterative(x));
        //Iterative approach
        int sum=1;
        for(int i = 5;i>=1;i--){
            sum*=i;
        }
        System.out.println("The value of 5 factorial of using iterative approach 2 is: "+sum);
    }
}
