public class operator_pre {
    public static void main(String[] args) {
        //precedence and associativity
        //int a = 68*4-90/8;
        //System.out.println(a);
        /*precedence of / and * is same
          therefore associativity will come in play.
          * and / ki associativity is left to right
         */
        //int b = 90/8-68*4;
        //System.out.println(b);

        //Quick Quiz
        int x = 6;
        int y = 1;
        double a = 1;
        double b = 5;
        double c = 2;
        //int k = x*y/2;
        double k = (b*b-4*a*c)/2*a;
        System.out.println(k);

    }
}
