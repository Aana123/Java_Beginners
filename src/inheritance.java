class Base{
    int x;
    public int getX() {return x;}
    public void setX(int x) {this.x = x;
        System.out.println("I can be in both base and derived class and setting x now");}
    public void pn(){
        System.out.println("I am a b :>");
    }
}
class Derived extends Base{
    int y;
    public int getY() {return y;}
    public void setY(int y) {this.y = y;
        System.out.println("I am in derived class and setting y now");}
}
class animal{
    String nme;
    public void aniaml(String nme){
        this.nme = nme;
    }
    public String getNme(){return nme;}
}
class dog extends animal{
    String str;
    public void voice(String str) {
        this.str=str;
    }
    public String getStr() {return str;}
}
public class inheritance {
    public static void main(String[] args) {
        Base bs = new Base();
        Derived de = new Derived();
        bs.pn();
        bs.setX(5);
        System.out.println(bs.getX());
        de.setY(7);
        System.out.println(de.getY());
        de.setX(6);
        System.out.println(de.getX());
        animal any = new animal();
        any.aniaml("Hicks");
        System.out.println(any.getNme());
        dog d = new dog();
        d.aniaml("Humpi");
        System.out.println(d.getNme());
        d.voice("Bark");
        System.out.println(d.getStr());

    }
}
