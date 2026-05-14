import java.util.Random;
import java.util.Scanner;

public class RandomGuess{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int guess;
        int attempts =0;
        int min=1;
        int max=100;
        int randomNumber= random.nextInt(max - min + 1) + min;
        System.out.println("number guessing game");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do{
            System.out.print("enter the guess :");
            guess=scanner.nextInt();
            attempts++;
            if ( guess<randomNumber) {
                System.out.println("To low,Try again!!:(");
                System.out.println();
            }else if ( guess>randomNumber) {
                System.out.println("TO high ,Try again!!:(");
                System.out.println();
            }
            else{
                System.out.println("correct guess!!,YOU WON");
                System.out.println("the number was "+randomNumber);
                System.out.println();
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess!=randomNumber);
        scanner.close();
    }
}
