import java.util.Scanner;
import java.util.Random;

public class NumGuessingGame {
    public static void main(String[] args) {
        //Generate a random number between 1 to 100

        Random ran = new Random();
        int randomNum = ran.nextInt(1,100);
        System.out.println("  Number guessing game  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of guess");
        int NoOfGuess = sc.nextInt();
        int count=0;
        for (int i = 1; i <= NoOfGuess; i++) {
            System.out.println("Enter the number between 1-100");
            int guessednum = sc.nextInt();
            count++;
            if (guessednum > randomNum) {
                System.out.println("The number is smaller than " +guessednum );
            } else if (guessednum < randomNum) {
                System.out.println("The number is greater than " + guessednum);
            } else if(guessednum==randomNum){
                System.out.printf("Congratulations!!You guessed the right number in %d attempts",count);
          break;  }



        }


    }
}
