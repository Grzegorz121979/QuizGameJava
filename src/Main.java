import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String[] question = {"How far is from the earth to the moon?: ", "The capital of Australia?: "};
        String[][] options = {{"A. 102200", "B. 855300", "C. 384400"}, {"A. Canberra", "B. Sydney", "C. Wellington"}};
        String[] answers = {"C", "A"};

        ArrayList<String> guesses = new ArrayList<>();

        int score = 0;

        for(int i = 0; i < question.length; i++) {
            System.out.println("-------------------");
            System.out.println(question[i]);
            for(int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter (A, B, C): ");
            String answer = keyboard.next().toUpperCase();
            guesses.add(answer);
            if(answer.equals(answers[i])) {
                score++;
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect, the answer is " + answers[i]);
            }
        }
        System.out.println("Your score is " + score);
    }
}
