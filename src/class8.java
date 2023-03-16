import java.util.Scanner;

public class class8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        class8 di=new class8();
        double result = di.calculate(num1, num2);

        System.out.println(result);
    }

    public double calculate(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
}
