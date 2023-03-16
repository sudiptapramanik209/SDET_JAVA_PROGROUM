import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOf_the_digit {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        //System.out.println(a);
        int digit=0;
        int sum=0;
        while(a>0){
            digit=a%10;
            sum=sum+digit;
            a=a/10;
        }
        System.out.println(sum);
    }
}
