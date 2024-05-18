class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
    public int getSalary(){
        //System.out.println("My salary is: "+salary);
        return salary;
    }
}
public class oops {
    public static void main(String[] args) {
        Employee hana = new Employee(); //instantiating a new employee object

        //setting attributes
        hana.id = 89;
        hana.name ="Hana";
        hana.salary =12000;
        //printing the attributes
        hana.printDetails();
        int salary = hana.getSalary();
        System.out.println("My salary is: "+salary);
        System.out.println(hana.id);
        System.out.println(hana.name);
        System.out.println(hana.salary);
    }
}
