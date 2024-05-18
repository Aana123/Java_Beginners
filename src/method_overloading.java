import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class method_overloading {
    Scanner cs = new Scanner(System.in);
    static void tellJoke (){
        System.out.println("I invented a new word!!\n" +
                "plagiarism");
    }
    static void change(int a){
        a = 98;
    }
    static void change1(int [] arr){
        arr[0] = 98;
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }
//    System.out.println("Enter name:");
//    String b = cs.next();
    static void foo(String b){
        System.out.println("Good morning " + b + " ! Have a nice day");
    }
    public static void main(String[] args) {
        tellJoke();
        //Case - 01 Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: "+x);
        int [] marks = {56,78,65,54,78};
        //Case - 02 Changing the array
        change1(marks);
        System.out.println("The value of x after running change is: "+marks[0]);

        //Method Overloading
        foo();
        foo("Aana"); //Arguments are actual!
    }
}
