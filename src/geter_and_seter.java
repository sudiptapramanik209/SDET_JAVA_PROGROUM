class zom{
    String str;
    String range="^[a-zA-Z]+$";//[0-9]validation for phone number
    public void Setstring(String s){
        if(s.matches(range)){
            str=s;
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

public class geter_and_seter {
    public static void main(String[] args) {
    zom br=new zom();
    br.Setstring("india");
    }
}
