import javax.swing.plaf.multi.MultiLabelUI;
import java.util.Scanner;

class Employee1{
    Scanner cs = new Scanner (System.in);
    int salary;
    String name;
    public void getSalary(){
        System.out.println("The salary is: "+salary);
    }
    public void getName(){
        System.out.println("My name is: "+name);
    }
//    public void setName(){
//        System.out.println("Enter new name: ");
//        String setnme = cs.next();
//        name = setnme;
//        System.out.println("New name is: "+ name);
//    }
    public void setName(String str){
        name = str;
        System.out.println("My new name is: "+name);
    }
}
class cellphone {
    public void type(int code) {
        if (code == 247) {
            System.out.println("vibrating");
        } else {
            System.out.println("ringing");
        }
    }
}
class square{
    int a;
    public void peri(){
        System.out.println("The perimeter of the square is: "+(4*a));
    }
    public void area(){
        System.out.println("The area of the square is: "+(a*a));
    }
}
class rect{
    int a;
    int b;
    public void peri1(){
        System.out.println("The perimeter of the rectangle is: "+2*(b+a));
    }
    public void area1(){
        System.out.println("The area of the rectangle is: "+(a*b));
    }
}
class tommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemies");
    }
    public void run(){
        System.out.println("Running from the enemies");
    }
    public void fire(){
        System.out.println("Firing on the enemies");
    }
}
class circle{
    int r;
    public void cirum(){
        System.out.println("The circumference of the circle is: "+2*(3.14*r));
    }
    public void area2(){
        System.out.println("The area of the circle is: "+2*(3.14*r*r));
    }
}
public class prac_set_8 {
    public static void main(String[] args) {
        //1.
        System.out.println("Q.1");
        Employee1 haan = new Employee1();  //instantiation of employee class
        haan.name = "Haan";
        haan.salary = 12000;
        haan.getSalary();
        haan.getName();
        haan.setName("ullu");

        //2.
        cellphone cell = new cellphone();  //instantiation of cellphone class
        System.out.println("Q.2");
        System.out.print("The phone is: ");
        cell.type(567);

        //3.
        square one = new square(); //instantiation of square class
        System.out.println("Q.3");
        one.a = 5;
        one.peri();
        one.area();

        //4.
        rect uno = new rect();  //instantiation of rect class
        System.out.println("Q.4");
        uno.a = 5;
        uno.b = 4;
        uno.peri1();
        uno.area1();

        //5.
        tommyVecetti tom = new tommyVecetti();  //instantiation of rect class
        System.out.println("Q.5");
        tom.run();
        tom.fire();
        tom.hit();

        //6.
        circle on = new circle();  //instantiation of rect class
        System.out.println("Q.6");
        on.r = 2;
        on.cirum();
        on.area2();
    }
}
