class A{
    public int a;
    public int meth1(){
        return 9;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override //recommended to use
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b =  new B();
        System.out.println(b.meth1());
        b.meth2();
        b.meth3();
    }
}
