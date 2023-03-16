import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String originalString= String.valueOf(Integer.parseInt(br.readLine()));
        System.out.print("Enter a string: ");
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Reversed string: " + reversedString);
    }
}
