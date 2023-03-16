public class class3 {
    public static void main(String[] args) {
        int max=0;
        int [] arr={1,3,5,3,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
