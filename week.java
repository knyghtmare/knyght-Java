import java.util.Scanner;

public class week {
    public static void main(String [] args) {

        Scanner keyboardInput = new Scanner(System.in);

        // empty str var for the day name
        String dayName = "";
        // day number int var
        System.out.print("Enter a day number: ");
        int dayNumber = keyboardInput.nextInt();

        switch(dayNumber) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Input!";
                break;
        }

        System.out.println("Day: " + dayName);
        keyboardInput.close();
    }
}