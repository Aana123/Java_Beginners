class Base1{
    Base1(){
        System.out.println("I am a constructor!");
    }
    Base1(int a){
        System.out.println("I am an overloaded base constructor with a value of a as: "+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //Base class ka argument wala constructor chalana chahte hai toh super keyword ka use
        //Varna by default Base ka bina argument wla constructor chalega
        super(4);
        System.out.println("I am a derived class constructor!");
    }
    Derived1(int a, int b){
        super(6);
        System.out.println("I am an overloaded derived constructor with a value of: "+a+" and "+b);
    }
}
class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("I am child of derived constructor!");
    }
    childOfDerived1(int a, int b, int c){
        super(a,b);
        System.out.println("I am an overloaded childOfDerived constructor with a value of: "+a+" and "+b+" and "+c);
    }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Base1 c = new Base1(5);
        Derived1 d = new Derived1();
        Derived1 e = new Derived1(14,2);
        childOfDerived1 ch = new childOfDerived1();
        childOfDerived1 ch1 = new childOfDerived1(69,96,56);
    }
}
