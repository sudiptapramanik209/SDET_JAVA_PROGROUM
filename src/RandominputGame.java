import java.util.Random;
import java.util.Scanner;

public class RandominputGame {
    private int randomNumber;
    private int[] inputs;
    private Scanner scanner;

    public RandominputGame() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100);
        inputs = new int[10];
        scanner = new Scanner(System.in);
    }

    public void play() {
        System.out.println("Guess a number between 0 and 99");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter input #%d: ", i+1);
            inputs[i] = scanner.nextInt();
        }
        printResults();
    }

    private void printResults() {
        System.out.printf("The random number was: %d\n", randomNumber);
        System.out.print("Your inputs were: ");
        for (int input : inputs) {
            System.out.printf("%d ", input);
        }
    }
}
