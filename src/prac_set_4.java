import java.util.Scanner;

public class prac_set_4 {
    public static void main(String[] args) {

        System.out.println("Q.1");
        //1. predict output
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter age: ");
        int a = cs.nextInt();
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        System.out.println("");
        System.out.println("Q.2");

        //2. chk whether a student is pass or fail if it requires total 40% and 33% in each subject having 3 subjects
        System.out.println("Enter marks in subject1: ");
        float b= cs.nextFloat();
        System.out.println("Enter marks in subject2: ");
        float c= cs.nextFloat();
        System.out.println("Enter marks in subject3: ");
        float d= cs.nextFloat();
        float e = (c+d+b)/3;
        if(b>=33 && c>=33 && d>=33 && e>=40){
            System.out.print("You have passed and your percentage is: ");
            System.out.println(e+"%");
        }
        else{
            System.out.println("You have failed!");
        }
        System.out.println("");
        System.out.println("Q.2 method-2");

        //zem
        byte m1, m2, m3;
        System.out.println("Enter marks in subject1: ");
        m1= cs.nextByte();
        System.out.println("Enter marks in subject2: ");
        m2= cs.nextByte();
        System.out.println("Enter marks in subject3: ");
        m3= cs.nextByte();
        float avg= (m1+m2+m3)/3;
        System.out.println("Your overall percentage is: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations!! You have been promoted!");
        }
        else{
           System.out.println("Hopeless failed!");
        }
        System.out.println("");
        System.out.println("Q.3");

        //3. calculate income tax paid by an employee
        System.out.println("Enter income: ");
        float in = cs.nextFloat();
        if(in>= 250000 && in<=500000){
           float t1 = (0.05f)*(in-250000);
            System.out.println("Your tax is: "+t1);
        }
        else if(in>=500000 && in<=1000000){
            float t2 = 0.05f*(500000-250000);
            float t3 = 0.2f*(in-500000);
            float t7 = t2+t3;
            System.out.println("Your tax is: "+t7);
        }
        else if(in>1000000){
            float t4 = 0.05f*(500000-250000);
            float t5 = 0.2f*(1000000-500000);
            float t6 = 0.3f*(in-250000);
            float t8 = t4+t5+t6;
            System.out.println("Your tax is: "+t8);
        }
        else{
            System.out.println("You don't belong in tax slab! ");
        }
        System.out.println("");
        System.out.println("Q.4");

        //4. to find out the day of the week
        System.out.println("Enter a number: ");
        int day = cs.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter a valid number and try again");
        }
        System.out.println("");
        System.out.println("Q.5");

        //5. chk for leap year
        System.out.println("Enter a year: ");
        int yr = cs.nextInt();
        if ((yr%4)==0){
            System.out.println("It is a leap year!!");
        }
        else{
            System.out.println("It is not a leap year!!");
        }
        System.out.println("");
        System.out.println("Q.6");

        //6. identify the type of website from the url
        System.out.println("Enter a url: ");
        String str = cs.next();
        if(str.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if(str.endsWith(".org")){
            System.out.println("It is an organisational website");
        }
        else if(str.endsWith(".in")){
            System.out.println("It is an indian website");
        }
        else {
            System.out.println("Website info out of reach");
        }
    }
}
