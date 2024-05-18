import java.util.Scanner;

public class array {
    public static void main(String[] args) {
       Scanner cs = new Scanner(System.in);

        //This is the syntax of an array
        // M-1 to declare an array
       int[] marks = new int[5]; //Declaration and memory allocation
        //The index of an array goes from 0 to (n-1) where n is the size of the array
        // Then initialization
       marks[0]= 100;
       marks[1]= 56;
       marks[2]= 89;
       marks[3]= 90;
       marks[4]= 78;
       System.out.println(marks[3]);

       /*
       M-2 to declare an array
       First declaration then memory allocation and then initialization
       int [] marks1;
       marks1=new int[5];

       M-3 to declare an array
       Declaration and initialization, automatic memory allocation
       int [] marks2 = {32,54,78,89,56}
       */

       int []marks3= new int[1];
        System.out.print("Enter marks1: ");
        marks3[0] = cs.nextInt();
        System.out.println(marks3[0]);

        //Length of an array
        System.out.println("Length of marks array is: "+marks.length);

        //string array
        String[] stud = {"Aadi","Aakarsh","Aana","Aanya","Aashi"};
        System.out.println(stud[2]);
        System.out.println("Length of stud array is: "+stud.length);

        System.out.println("Data of the array is:");
        //1. Displaying an array (Naive way)
        System.out.println(stud[0]);
        System.out.println(stud[1]);
        System.out.println(stud[2]);
        System.out.println(stud[3]);
        System.out.println(stud[4]);

        //2. Displaying the array (for loop)
        System.out.println("Printing using for loops");
        for(int a = 0; a<marks.length;a++){
            System.out.println(marks[a]);
        }

        //Quick Quiz
        //Displaying the elements in reverse order
        System.out.println("Printing using for loops in reverse order");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //3. Displaying using for-each loop
        System.out.println("Printing using for-each loop");
        for(String element: stud){
            System.out.println(element);
        }
    }
}
