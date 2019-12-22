import java.util.Scanner;

public class methods {
    public static void main(String [] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = keyboardInput.nextDouble();
        System.out.print("Enter the operation: ");
        String operation = keyboardInput.next();
        System.out.print("Enter number 2: ");
        double number2 = keyboardInput.nextDouble();

        if (operation.equals("+")) {
            System.out.println(number1 + number2);
        } else if (operation.equals("-")) {
            System.out.println(number2 - number1);
        } else if (operation.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operation.equals("/")) {
            System.out.println(number2 / number1);
        } else {
            System.out.println("Invalid Operator!");
        }

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
