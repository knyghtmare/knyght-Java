import java.util.Scanner;

public class methods {
    public static void main(String [] args) {
        // code here

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = keyboardInput.nextDouble(); // .nextDouble(), .nextInt()

        System.out.print("Enter Operator: ");
        String op = keyboardInput.nextLine();

        System.out.print("Enter num2: ");
        double num2 = keyboardInput.nextDouble();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            System.out.println(num1 - num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Invalid Operator");
        }

        // System.out.println(num1 + num2);
        keyboardInput.close();
    }
    /*
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static double subNumbers(double num1, double num2) {
        return num2 - num1;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num2 / num1;
    }

    public static void sayHi(String name) {
        System.out.println("Hi, " + name + "!");
    }
    */
}
