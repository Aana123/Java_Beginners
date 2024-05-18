import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = cs.nextInt();
        if (age>60){
            System.out.println("You will get 50% discount!");
        }
        else if(age>50){                                                                    //if, else if, else ladder. At a time ek he execute hoga
            System.out.println("You will get 40% discount!");
        }
        else if(age>40){
            System.out.println("You will get 30% discount!");
        }
        else {
            System.out.println("You will not get any discount!");
        }

        //Switch Case control
        System.out.println("Enter age:");
        int age1 = cs.nextInt();
        switch (age1) {
            case 13 -> System.out.println("You are a teenager now!");
            case 18 -> System.out.println("You are an adult now!");
            case 23 -> System.out.println("You will join a job now!");               //enhanced switch
            case 60 -> System.out.println("You will retire now!");
            default -> System.out.println("Enjoy your life!!");
        }
        System.out.println("Thanks for using my java code :) ");
    }
}
//integer ki jagah char var string sab chalega but is rarely used