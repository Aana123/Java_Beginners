class mEmployee{
    private int id;
    private String name;
    private int salary;
    //Making a constructor
    public mEmployee(String myName, int myId,int mySalary){
        name = myName;
        id = myId;
        salary = mySalary;
    }
    public mEmployee(){
        name = "Shaanya";
        id = 54;
        salary = 567432;
    }
    public void setId(int i) { this.id = i; }
    public void setName(String i){ this.name =i; }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public int getSalary(){ return salary; }
}


public class constructors {
    public static void main(String[] args) {
        mEmployee emp1 = new mEmployee("Shana",56,4798356);  //instantiation of mEmployee class and passing parameters through constructor
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
        mEmployee emp2 = new mEmployee();
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getSalary());
    }
}
