import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner cs = new Scanner(System.in);
        int age = cs.nextInt();
        if(age>18){
            System.out.println("Yes you can drive!");
        }
        else{                                                                                                           //else if optional
            System.out.println("You cannot drive yet");
        }
        //M-2
        System.out.println("Enter age: ");
        int age1= cs.nextInt();
        boolean bool = age1>18;
        if(bool){
            System.out.println("Yes you can drive!");
        }
        else{
            System.out.println("You cannot drive yet");
        }
    }
}
