import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        boolean PerfectSquare = false;
        for (int i=1;i*i<=num;i++) {
            if (i*i==num) {
                PerfectSquare=true;
                break;
            }
        }

        if (PerfectSquare) {
            System.out.println(num + "is a perfect square");
        } else {
            System.out.println(num + "is not a perfect square");
        }
    }
}
