import java.util.Scanner;
import java.util.Random;
public class exercise_2 {
    public static void main(String[] args) {
        //Rock paper scissors game
        Scanner cs = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Choose any one of the choices: 1 = rock, 2 = paper, 3 = scissors");
        int user = cs.nextInt();
        int comp = rand.nextInt(4);
        if(user==1 && comp==1){
            System.out.println("You have chosen rock, computer has also chosen rock. Result- It's a tie");
        }
        else if (user==2 && comp==1){
            System.out.println("You have chosen paper, computer has chosen rock. Result- You have won");
        }
        else if (user==3 && comp==1){
            System.out.println("You have chosen scissors, computer has chosen rock. Result- Comp has won");
        }
        else if (user==1 && comp==2){
            System.out.println("You have chosen rock, computer has chosen paper. Result- Comp has won");
        }
        else if (user==1 && comp==3){
            System.out.println("You have chosen rock, computer has chosen scissors. Result- You have won");
        }
        else if (user==2 && comp==2){
            System.out.println("You have chosen paper, computer has chosen paper. Result- It's a tie");
        }
        else if (user==2 && comp==3){
            System.out.println("You have chosen paper, computer has chosen scissors. Result- Comp has won");
        }
        else if (user==3 && comp==2){
            System.out.println("You have chosen scissors, computer has chosen paper. Result- You have wom");
        }
        else if (user==3 && comp==3){
            System.out.println("You have chosen scissors, computer has also chosen scissors. Result- It's a tie");
        }
        else{
            System.out.println("Badhiya hai na :) optimising and aur rounds add krne ka dekhna");
        }
    }
}
