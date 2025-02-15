//Description:
//The program will randomly generate a number between 1 and 100.
//The user has to guess the number.
//The program will give hints like "Too High" or "Too Low."
//The game continues until the user guesses correctly.
//The program will count the number of attempts and display the result.
// Program Start From Here:

import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        //    Creating Objects
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(100)+1;
        int attemp = 0;
        int guess = 0;


        while (guess != randomNumber){
            System.out.print("Guess The Number between 1 - 10 : ");
            guess = sc.nextInt();
            attemp++;

                System.out.println("Attemp: "+attemp);
                if(guess < randomNumber){
                    System.out.println("Too Low");
                } else if (guess>randomNumber) {
                    System.out.println("Too High");
                }else {
                    System.out.println("Congress You win Random No. is: "+randomNumber);
                }

                    }



    }

}
