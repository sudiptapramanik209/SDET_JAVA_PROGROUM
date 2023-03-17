import java.util.Random;
import java.util.Scanner;

public class RandomInput {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[10];
        System.out.println("Guess a number between");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter input", i+1);
            inputs[i] = scanner.nextInt();
        }
        System.out.printf("The random number was:", randomNumber);
        System.out.print("Your inputs were: ");
        for (int input : inputs) {
            System.out.printf("%d ", input);
        }
    }
}
