//import java.util.Random;
//
//class game{
//    public void startGame(){ System.out.println("Let's play guess the number game:"); }
//    Random rand = new Random();
//    int num = rand.nextInt(100);
//    int guess =5;
//    public game(int a){
//        for(int b =0;b<guess; b++){
//            if(a == num){
//                System.out.println("You have won!");
//                break;
//            }
//            else if(num>a && b!=guess-1){
//                System.out.println("The number is greater than "+a);
//                break;
//            }
//            else if(a<num && b!=guess-1){
//                System.out.println("The number is less than "+a);
//                break;
//            }
//            else {
//                System.out.println("You have exhausted all your guesses! The number is:");
//            }
//        }
//        System.out.println("The number is: "+num);
//    }
//}
//public class exercise_3 {
//    public static void main(String[] args) {
//        game try1 = new game(66);
//        try1.startGame();
//        //try2.startGame();
//    }
//}
////Kaafi bekaar, rip logic :( 0/10 write again


//Solution
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner cs = new Scanner(System.in);
        inputNumber = cs.nextInt();
    }

    boolean isCorrectNumber(){
        numberOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yayy!! You've guessed it right! The number is: %d\nYou guessed it in %d attempt(s).",number,numberOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Kaafi small...");
        }
        else if (inputNumber>number){
            System.out.println("Kaafi bada...");
        }
        return false;
    }
}

public class exercise_3 {
    public static void main(String[] args) {
        Game gg = new Game();
        boolean b = false;
        while(!b){
            gg.takeUserInput();
            b = gg.isCorrectNumber();
        }
    }
}