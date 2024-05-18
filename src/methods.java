import java.util.Scanner;

public class methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z= x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        //Object invocation using object creation -> helps to avoid static method -> just like scanner object
        //methods obj = new methods();
        //Calling the object
        //c = obj.logic(a,b);

        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = cs.nextInt();
        System.out.println("Enter b:");
        int b = cs.nextInt();
        int c ;
        c = logic(a,b);
        System.out.println("Output:");
        System.out.println(c);
    }
}

