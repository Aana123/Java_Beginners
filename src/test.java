import java.util.Scanner;
class sum{
    Scanner cs = new Scanner(System.in);
    int a;
    int b;
    sum(){
        System.out.println("happy,happy,happy :)");
    }
    sum(int a){
        System.out.println("Enter the numbers, x and y:");
        int x = cs.nextInt();
        int y = cs.nextInt();
        int c = a+x+y;
        System.out.println("The sum  of "+a+", "+x+" and "+y+" is: "+c);
    }
    sum(int a, int b ){
        this.a =a;
        this.b =b;
        int c =a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+c);
    }
}
class multi extends sum{
    multi(int c,int d){
        super(c,d);
        int e = c*d;
        System.out.println("The multiplication of "+c+" and "+d+" is: "+e);
    }
}
public class test {
    public static void main(String[] args) {
        sum s = new sum();
        sum ss = new sum(3);
        sum sss = new sum(5,5);
        multi m = new multi(5,5);
    }
}
