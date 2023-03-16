import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class class2 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int marks= Integer.parseInt(br.readLine());
        //int marks=97;
        /*if(marks>90){
            System.out.println("you get a cycle");
        }
        else if(marks>80){
            System.out.println("you watch a tv");
        } else if (marks>70) {
            System.out.println("go to room");
        }*/

        for(int i=0;i<=20;i++){
            if(i%2==1){
                System.out.println(i);
            }

        }
    }
}
