import java.util.Scanner;

public class methods {
    public static void main(String [] args) {
        // code here
        sayHi("Knyght");

        // better calculator
        double resultadd = addNumbers(88.00, 2.00);
        System.out.println(resultadd);

        Scanner calculatorInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number1 = calculatorInput.nextDouble();

        // System.out.print("Enter operator: ");
        // String operator = calculatorInput.nextLine();

        System.out.print("Enter Operator: ");
        String op = calculatorInput.nextLine();
 
        System.out.println();
        
        System.out.print("Enter a second numer: ");
        double number2 = calculatorInput.nextDouble();

        double result = 0.0;

        if (op == "+") 
        {
            result = addNumbers(number1, number2);
            System.out.println("Addtion: ");
        } 
        else if (op == "-") 
        {
            result = subNumbers(number1, number2);
            System.out.println("Difference: ");
        } 
        else if (op == "*") 
        {
            result = product(number1, number2);
            System.out.println("Product: ");
        } 
        else if (op == "/") 
        {
            result = divide(number1, number2);
            System.out.println("Quotient: ");
        } 
        else 
        {
            System.out.println("Inavlid Operator!");
        }

        System.out.println(result);

        calculatorInput.close();
    }

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
}