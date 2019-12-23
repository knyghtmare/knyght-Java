import java.util.Scanner;

public class quiz {
    public static void main(String [] args) {
        // code here
        String q1 = "What is the color of an orange?\n" +
                    "A. Red\nB. Blue\nC. Orange";

        String q2 = "What is the color of a banana?\n" +
                    "A. Red\nB. Yellow\nC. Orange";

        Question [] questions = {
            new Question(q1, "c"),
            new Question(q2, "b")
        };

        takeTest(questions);
    }

    public static void takeTest(Question [] questions) {
        // code here
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();

            if (answer.toLowerCase().equals(questions[i].answer)) {
                score++;
            }
        }

        System.out.println("You got " + score + "/" + questions.length);
        keyboardInput.close();
    }
}