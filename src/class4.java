import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        if (num >= 100 && num <= 999) {
            System.out.println("The number" + num + "is a 3-digit number.");
        } else {
            System.out.println("The number" + num + "is not a 3-digit number.");
        }

    }
}
