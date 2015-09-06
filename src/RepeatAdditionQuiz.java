import java.util.Scanner;

/**
 * Created by Dinesh on 9/6/2015.
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {

        // Declare two random numbers
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + num1 + " + " + num2 + " ?");

        int answer = input.nextInt();
        // run a loop while answer is correct
        while (num1 + num2 != answer) {
            System.out.println("Wrong Answer ! What is " + num1 + " + " + num2 + " ?");
            answer = input.nextInt();
        }

        System.out.println("Correct Answer");

    }
}
