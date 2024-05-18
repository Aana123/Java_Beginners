public class break_7_continue {
    public static void main(String[] args) {
        // Break and continue using for loops
        //break in for loop
        System.out.println("This is break in for loop: ");
        for(int a = 0; a<5;a++){
            System.out.println(a);
            if(a==2){
                System.out.println("Ending the sequence");
                break;
            }
        }
        //break in while loop
        System.out.println("This is break in while loop: ");
        int i = 0;
        while(i<5){
            System.out.println(i);
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loop se bahar :) ");

        //break in do while loop
        System.out.println("This is break in do while loop: ");
        int k = 0;
        do{
            System.out.println(k);
            if(k==2){
                System.out.println("Ending the loop");
                break;
            }
            k++;
        } while(k<5);
        System.out.println("Loop se bahar :) ");

        //continue in for loop
        System.out.println("This is continue in for loop: ");
        for(int b = 0; b<5;b++){
            if(b==2){
                System.out.println("This is printed when i==2");
                continue;
            }
            System.out.println(b);
        }
        //continue in while loop
        System.out.println("This is continue in while loop: ");
        int p = 0;
        while(p<5){
            p++;
            if(p==2){
                System.out.println("This is printed when i==2");
                continue;
            }
            System.out.println(p);
        }
        System.out.println("Loop se bahar :) ");

        //continue in do while loop
        System.out.println("This is continue in do while loop: ");
        int h = 0;
        do{
            h++;
            if(h ==2){
                System.out.println("This is printed when i==2");
                continue;
            }
            System.out.println(h);
        } while(h <5);
        System.out.println("Loop se bahar :) ");
    }
}
