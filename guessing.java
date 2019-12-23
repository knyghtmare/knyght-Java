import java.util.Scanner;

public class guessing {
    public static void main(String [] args) {
        Scanner keyboardInput = new Scanner(System.in);

        String answer = "Balerion";
        String guess = "";
        int guesses = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while ( guess != answer && !outOfGuesses) {
            System.out.print("Enter Guess: ");
            guess = keyboardInput.nextLine();
            guesses++;
            if (guess.equals(answer)) {
                System.out.println("Correct!");
                break;
            } else if (guesses == guessLimit) {
                outOfGuesses = true;
                System.out.println("Out of guesses.");
                break;
            } else {
                continue;
            }
        }

        keyboardInput.close();
    }
}