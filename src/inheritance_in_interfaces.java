interface sampleInterface{
    void meth1();
    void meth2();
}
interface childOfSampleInterface extends sampleInterface{                                                               //Inheritance of Interface
    void meth3();
    void meth4();
}
class MySampleClass implements childOfSampleInterface{
    public void meth1(){
        System.out.println("I am Method 1");
    }
    public void meth2(){
        System.out.println("I am Method 2");
    }
    public void meth3(){
        System.out.println("I am Method 3");
    }
    public void meth4(){
        System.out.println("I am Method 4");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
