public class var_args {
    //M1 (Aam zindagi)
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    //M2 (Mentos zindagi -> using varargs)
    static int sum(int x,int ...arr){
        //Ek argument pass karna is compulsory
        //Available as int [] arr;
        int result = x;
        for(int d: arr){
            result+=d;
        }
        return result;
    }
    public static void main(String[] args) {
        //For m1
        System.out.println("Welcome to varargs! ");
        System.out.println("The sum of 4 & 5 is: "+ sum(4,5));
        System.out.println("The sum of 4,5 & 8 is: "+ sum(4,5,8));
        //For m2
        System.out.println("Welcome to varargs! ");
        System.out.println("The sum of 4,4,4 & 5 is: "+ sum(4,5,4,4));
        System.out.println("The sum of 4,9,9,7 & 8 is: "+ sum(4,9,9,8,7));
    }


}
