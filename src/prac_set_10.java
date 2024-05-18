class circle1{
    int r;
    void area(int r){
        this.r = r;
        System.out.println("The area of the circle is: "+Math.PI*r*r);
    }
}
class cylinder1 extends circle1{
    void area(int r,int h){
        System.out.println("The area of the cylinder is: "+2*Math.PI*r*h);
    }
}
class rect1{
    int l =6;
    int b =6;
    void area(int l, int b){
        System.out.println("The area of the given rectangle is: "+l*b);
    }
}
class cuboid extends rect1{
    int h;
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    void volume(){
        System.out.println("The volume of the cuboid is: "+l*b*h);
    }
}

public class prac_set_10 {
    public static void main(String[] args) {
        //1.
        circle1 circ = new circle1();
        circ.area(5);
        cylinder1 cyl = new cylinder1();
        cyl.area(5,10);
        cyl.area(9);
        //2.
        rect1 rec = new rect1();
        rec.area(5,5);
        cuboid cub = new cuboid ();
        cub.setH(5);
        cub.getH();
        cub.volume();
    }
}
