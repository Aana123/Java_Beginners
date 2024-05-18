interface Bicycle{                                                                                                      //Group of methods
    int speed = 300;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvoCycle implements Bicycle{
    int speedNew;
    void blowHorn(){
        System.out.println("Yamla pagla deewana");
    }
    public void applyBrake(int dec){
        speedNew = speed - dec;
        System.out.println("Applying brake");
        System.out.println("The new speed is: "+speedNew);
    }
    public void speedUp(int inc){
        System.out.println("Speeding Up");
        speedNew = speed + inc;
        System.out.println("The new speed is: "+speedNew);
    }
}
public class interfaces {
    public static void main(String[] args) {
        AvoCycle cy1 = new AvoCycle();
        cy1.blowHorn();
        System.out.println("The initial speed is: "+cy1.speed);
        cy1.applyBrake(50);
        cy1.speedUp(100);
    }
}
