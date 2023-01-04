import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] question = {"How far is from the earth to the moon?: ", "The capital of Australia?: "};
        String[] options = {"A. 102200", "B. 855300", "C. 384400", "A. Canberra", "B. Sydney", "C. Wellington"};
        String[] answers = {"C", "A"};

        ArrayList<String> guesses = new ArrayList<>();

        int score = 0;

        int questionNumber = 0;

        for(int i = 0; i < question.length; i++) {
            System.out.println("-------------------");
            System.out.println(question[i]);
            for(int j = 0; j < options.length; j++) {
                System.out.println(options[j]);
            }
        }
    }
}
