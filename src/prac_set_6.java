import java.util.Scanner;

public class prac_set_6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        //1. Print an array of 5 floats and calc their sum
        System.out.print("Q.1  ");
        float [] a  = {6.9f,7.9f,4.6f,8.7f,3.5f};
        float b = 0;
        for(int i = 0; i<a.length;i++){
            float c = a[i];
            b+=c;
        }
        System.out.println("The sum of 5 float array is: "+b);

        //2. Wap to chk whether an element is in an array or not
        System.out.println(" ");
        System.out.print("Q.2  ");
        System.out.print("Enter the element you want to check: ");
        int [] marks = {67,98,77,46,35};
        int d = cs.nextInt();
        for(int j = 0; j<a.length;j++){
            if(d == marks[j]){
                System.out.println("Yes the element is in the array");
            }
        }
        //zem
        System.out.println(" ");
        System.out.println("M 2");
        System.out.print("Enter the element you want to check: ");
        float e = cs.nextFloat();
        //Logic thoda hatke
        boolean bool = false;
        for(float element:a){
            if(e==element) {
                bool = true;
                break;
            }
        }
        if(bool){
            System.out.println("The element is in the array");
        }
        else{
            System.out.println("The element is not in the array");
        }

        //3. Calculate the average marks from an array containing physics marks using for each loop
        System.out.println(" ");
        System.out.println("Q.3");
        float avg = 0;
        for(float element:marks){
            avg+=element;
        }
        float sum = avg/marks.length;
        System.out.println("The avg of marks is: "+sum);

        //4. Wap a java program to add 2 matrices of order 2*3
        System.out.println(" ");
        System.out.println("Q.4");

        int [][] mat1 = {{1,3,4},
                    {4,5,6}};
        int [][] mat2 = {{3,2,5},
                    {6,7,8}};           
        int [][] result = {{0,0,0},
                      {0,0,0}};

        for(int f = 0;f<mat1.length;f++){
            for(int k = 0;k<mat1[f].length;k++){
                result[f][k] = mat1[f][k]+mat2[f][k];
                System.out.print(result[f][k]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //5. Wap a java program to reverse an array
        System.out.println(" ");
        System.out.println("Q.5 ");
        String [] stud = {"Aana","Aanshi","Aansha","Aanki","Aankil"} ;
        for(int m = stud.length-1; m>=0;m--){
            System.out.println(stud[m]);
        }

        //6. Wap to find the max value element in an array
        System.out.println(" ");
        System.out.println("Q.6");
        int [] marks2 = {67,98,77,46,35};
        int max = 0;
        for(int q: marks2){
            if(q>max){
                max=q;
            }
        }
        System.out.println("The maximum valued element is: "+max);

        //7. Wap to find the min value element in an array
        System.out.println(" ");
        System.out.println("Q.7");
        int [] marks3 = {67,98,77,46,35};
        int min = 1000;
        for(int q: marks3){
            if(q<min){
                min=q;
            }
        }
        System.out.println("The maximum valued element is: "+min);

        //8. Wap to find whether an array is sorted or not
        //sorting in ascending order
        System.out.println(" ");
        System.out.println("Q.8");
        int [] marks4 = {67,98,77,46,35};
        boolean isSorted = true;
        for(int r =0;r<marks4.length-1;r++){
            if(marks4[r]>marks4[r+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted!");
        }
        else{
            System.out.println("The array is not sorted!");
        }
    }
}
