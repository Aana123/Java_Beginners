import java.util.Scanner;
class Book{

}
class Library {
    String[] Booklist = {"Harry Potter","Sapiens","The Hobbit","Don Quixote","The tale of two cities"};
    Scanner cs = new Scanner(System.in);
    String[] Buklist = new String[5];
//    Buklist [0] = "Harry Potter";
//    Buklist [1] = "Hari Patloon";
    void addBook(){
        System.out.println("Enter book name:");
        String name = cs.next();
        for(int i = 0;i<Buklist.length;i++){
            Buklist[i]=name;
        }
        System.out.println("Your book has been added!");
    }
    public void issueBook(){
        System.out.println("Enter the book's name that you want to issue: ");
        String nam = cs.next();
        System.out.println("Checking availability.......\nBook successfully issued!");
    }
    public void returnBook(){
        System.out.println("Thanks! Please visit again :)");
    }
    public void showBooks(){
//        for(int i =Booklist.length-1;i>=0;i--){
//            System.out.println(Booklist[i]);
//        }
        for(int i = 0; i<Buklist.length;i++){
            System.out.println(Buklist[i]);
        }
    }
    public void menu(){
        System.out.println("----------------------------------Menu-------------------------------------");
        System.out.println("1. Add a new book\n2. Issue a book\n3. Return a book\n4. Show books\n5. Exit\n---------------------------------------------------------------------------");
        System.out.println("Enter your choice:");
        int input = cs.nextInt();
        //boolean b = true;
        if(input==1){
            addBook();
        }
        else if(input==2){
            issueBook();
        }
        else if(input==3){
            returnBook();
        }
        else if(input==4){
            showBooks();
        }
        else if(input==5){
            System.out.println("You can now exit!");
            //break;
            //b =  false;
        }
        else{System.out.println("Thank you!");}
    }

}
public class exercise_4 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.menu();
//        while(true){
//            lib.menu();
//        }
    }
}
