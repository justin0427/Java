package Ch7;
public class Ch7_17 {
    public static void main(String[] args){
        int[] arr={75, 29, 38, 45, 16};
        int a=min(arr);
        System.out.println(a);
    }
    public static int min(int[] arr){
        int b=arr[0];
        for (int i=0;i<arr.length;i++){
            if(b>arr[i]){
                b=arr[i];
            }
        }
        return b;
    }
}