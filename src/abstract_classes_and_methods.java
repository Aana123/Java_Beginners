abstract class Parent {                                                                                                 //Abstract class ka object nhi bana sakte vo bas ek zariya hai new subclasses banane ka
    public Parent(){
        System.out.println("I am a constructor in Parent");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();                                                                                       //Pretty much like a template method saari subclasses apne hisaab se customise kar skti hai
}
class kiddo1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
}
abstract class kiddo2 extends Parent{
    public void th(){
        System.out.println("I am good!");
    }
}
public class abstract_classes_and_methods {
    public static void main(String[] args) {
        //Abstract -> khayali pulao (Thought hai imangi hai, not having physical/concrete presence)
        //Abstract method -> declared without an implementation
        //Abstract class -> a class that is declared as abstract or if it includes abstract methods
        //Ek abstract method poori class ko abstract bana deti hai
        //Parent pa = new Parent(); -> Abstract class cannot be called hohoho
        kiddo1 kid = new kiddo1();
        kid.sayHello();
        kid.greet();
        Parent pa = new kiddo1();                                                                                       //Abstract class (superclass) ke reference ko equate kr skte hain subclass ke reference ke (dynamic method dispatch)
        pa.sayHello();
        pa.greet();
    }
}
