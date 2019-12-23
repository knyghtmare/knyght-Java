import java.util.InputMismatchException;
import java.util.Scanner;

public class tryandcatch {
    public static void main(String [] args) {
        Scanner keyboardInput = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double num = keyboardInput.nextDouble();
            System.out.println(num);
        } catch(InputMismatchException e) {
            System.out.println(e);
        }

        keyboardInput.close();
    }
}