public class multidimensional_arrays {
    public static void main(String[] args) {
        int [][] flats = new int [2][3];      //2 rows and 3 columns
        //row 1  ( ground floor of a building with 3 flats )
        flats [0][0]= 100;
        flats [0][1]= 101;
        flats [0][2]= 102;
        //row 2  ( first floor of a building with 3 flats )
        flats [1][0]= 105;
        flats [1][1]= 103;
        flats [1][2]= 104;

        //Displaying the 2d array (for loop)                         ""KAAFI ZYADA IMPORTANT""
        System.out.println("Printing 2d array using for loops");
        for(int a = 0; a<flats.length;a++){
            for(int j = 0; j<flats[a].length;j++) {
                System.out.print(flats[a][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
