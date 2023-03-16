class zoom{
    int i;
    int j;
    int sum;
    public void tb(int a,int b){
        i=a;
        j=b;
    }
    public int get_the_value(){
        return i+j;
    }
}
public class class10 {
    public static void main(String[] args) {
        zoom z=new zoom();
        z.tb(4,4);
        System.out.println(z.get_the_value());
    }
}
