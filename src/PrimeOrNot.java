import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int n=Integer.parseInt(br.readLine());
        boolean a=PrimeNumber(n);
        if(a){
            System.out.println("it is Prime");
        }else{
            System.out.println("it is not");
        }

    }
    public static boolean PrimeNumber(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

