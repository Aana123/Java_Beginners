class EkClass{
    int a;
    EkClass(int a){
        //without this the following line will give 0 as output
        //android development mein kaafi use
        //a very good practice
        this.a = a;
    }
    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor! and value of c is: "+c);
    }
}
public class this_and_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(8);
        System.out.println(e.getA());
        DoClass d = new DoClass(6);
    }
}
