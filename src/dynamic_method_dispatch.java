class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void toime(){
        System.out.println("Time is 10 am...");
    }
}
class SmartPhone extends Phone{
    public void musicc(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone ob = new Phone();
        SmartPhone sm = new SmartPhone();
        ob.on();
        ob.toime();
        sm.on();
        sm.musicc();
        //Samsung M21 ek smartphone toh hai he saath he ek phone bhi hai toh
        //Phone obo = new SmartPhone():   is valid

        //i.e, superclass ka reference barabar ho skta hai subclass ke object ke but the converse is not true

        //But Nokia 1100 bas ek phone hai Smartphone nhi toh
        //SmartPhone sm = new Phone():    is not valid

        Phone obo = new SmartPhone();
        //Runtime pr object create hoga!
        //Phone keh rhe hain smartphone ko
        //Superclass ke saare methods run honge :)
        obo.on();
        obo.toime();
        //Phone ka reference liya hai tbhi ese krna pd rha
        ((SmartPhone) obo).musicc();
    }
}
