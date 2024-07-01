import java.util.*;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("welcome to the number guessing game! : ");

        while (playAgain){
            //genrate the random number
            int secretno = 1 + (int) (100 *Math.random());
            // limit the number of attempts
            int maxAttempts = 5;
            int attempts = 0;

            System.out.println("I,ve chosen a number between 1 and 100 : ");
            System.out.println("you have " + maxAttempts + " attempts to guess it number :");

            while (attempts < maxAttempts) {
                System.out.println("enter you guess number :");
                int userno = sc.nextInt();

                if(userno == secretno){
                    System.out.println("congrulation! you guess the genrated number : ");
                    }else if (userno < secretno){
                         System.out.println("The number is greater than " + userno );
        }else {
             System.out.println("the number is smaller than  " + userno);
        }
        attempts++;
    }
    if(attempts == maxAttempts){
         System.out.println("you have exhausted all " + maxAttempts + "maxattempts :");
         System.out.println("the correct number was " + secretno);
    }

     System.out.println("play Again ? (yes/No): ");
     String playChoice = sc.next().toLowerCase();
     playAgain = playChoice.equals("yes");
}
System.out.print("Thank you for playing! have a great day!");
sc.close();
    }
}