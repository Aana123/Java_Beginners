class cylinder{
    int r;
    int h;
    public void setRad(int r){ this.r = r;}
    public int getRad(){ return r; }
    public void setHei(int h){ this.h = h; }
    public int getHei(){ return h; }
    public void area3(){System.out.println("The total surface area of the given cylinder is: "+2*3.14*r*(h+r));}
    public void vol(){System.out.println("The volume of the given cylinder is: "+3.14*r*r*h);}
    public cylinder(int r, int h){
        System.out.println("The curved surface area is: "+2*Math.PI*r*h);
    }
}
class Rect{
    private int len;
    private int bred;
    public Rect(){
        this.len = 5;
        this.bred = 4;
    }
    public Rect(int len,int bred){
        this.len = len;
        this.bred = bred;
    }
    public int getLen(){return len;}
    public int getBred(){return bred;}
}

public class prac_set_9 {
    public static void main(String[] args) {
        //1. Create a class cylinder and use getters and setters to set it's radius and height
        cylinder xy = new cylinder(54,34);
        xy.setRad(10);
        int a = xy.getRad();
        System.out.println("The radius of the cylinder is: "+a);
        xy.setHei(50);
        int b = xy.getHei();
        System.out.println("The height of the cylinder is: "+b);
        xy.area3();
        xy.vol();
        //2. rect constructor overloading
        Rect rec = new Rect();
        System.out.println(rec.getLen());
        System.out.println(rec.getBred());
        Rect rec1  = new Rect(2,7);
        System.out.println(rec1.getLen());
        System.out.println(rec1.getBred());
        //error handling you do :(
    }
}
