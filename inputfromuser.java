import java.util.Scanner;

public class inputfromuser {
    public static void main(String [] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboardInput.nextLine();

        System.out.print("Enter your Age: ");
        int age = keyboardInput.nextInt();

        System.out.println("Hey, "+ name + "! You are " + age + " years old!");
        keyboardInput.close();
    }
}