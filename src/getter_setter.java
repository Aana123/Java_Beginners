class myEmployee{
    private int id;
    private String name;

    public void setId(int i) {
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String i){
        this.name =i;
    }
    public String getName(){
        return name;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        myEmployee emp1 = new myEmployee();
        //emp1.id = 89;
        //emp1.name ="Mona"; --> throws an error due to private access modifier
        emp1.setName("Hank");
        System.out.println(emp1.getName());
        emp1.setId(34);
        System.out.println(emp1.getId());

    }
}
