import java.util.Scanner;

public class rebase_answer42
{
    public static void main(String[] args)
    {
        // Create a scanner named input
        Scanner input = new Scanner(System.in);

        // Prompt user for answer
        System.out.println("What is the answer to life, the universe, and everything?");

        int number = 42; // Answer
        int userNumber = 0; // Store user's guesses
        
        // Loop until answer is correct
        while (userNumber != number) {
            
            // Prompt the user to guess the number
            System.out.print("\nYour Answer: ");
            
            // Grab answer
            userNumber = input.nextInt();
            
            // Check answer
            if (userNumber == number) {
                System.out.println("Yes, the number is " + number + ".");
            } else if (userNumber > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }

        // Close the scanner
        input.close();
    }
}

