import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofSerise {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        int n=Integer.parseInt(br.readLine());
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum+=Math.pow(2,i);
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
