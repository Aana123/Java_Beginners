public class logical_ops {
    public static void main(String[] args) {
      boolean a = true;
      boolean b = false;
      boolean c = true;                                                                                                  // && -> logical and
      if (a && b || c){                                                                                                  // || -> logical or
          System.out.println("Y");                                                                                       // ! -> logical not
      }
      else{
          System.out.println("N");
      }
      //for logical not
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!c);
    }
}
