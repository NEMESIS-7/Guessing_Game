import java.util.Scanner;
import java.util.Random;
public class GUESSINGGAME {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertoguess = random.nextInt(20);
        Scanner input = new Scanner(System.in);
        //setting the number of attempts
        int numofattempts = 5;

        System.out.println("guess any number between 1 and 20: ");
        while(numofattempts > 0){
            System.out.println("Attempts left " + numofattempts);
            int guess = input.nextInt();
            numofattempts --;

            if (guess > 20){
                System.out.println("you are outside the range. choose a number from 0 to 20");
            }else if (guess == numbertoguess){
                System.out.println("you have guessed correctly, number of attempts left is " + numofattempts);
                break;
            }else if (guess > numbertoguess){
                System.out.println("too high, come lower. You have  " + numofattempts + " attempts left.");
            }else{
                System.out.println("too low, come higher. You have " + numofattempts + " attempts left.");
            }if (numofattempts == 0){
                System.out.println("you have run out of attempts. \n" + "Attempts left = \n" + numofattempts + ". \n" + "the correct number is " + numbertoguess + ". play again.\n");
            }
        }
    }
}