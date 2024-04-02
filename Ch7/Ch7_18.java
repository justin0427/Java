package Ch7;
public class Ch7_18 {
    public static void main(String[] args){
        int[] arr={75, 29, 38, 45, 16};
        int a=argmin(arr);
        System.out.println(a);
    }
    public static int argmin(int[] arr){
        int b=arr[0],index=0;
        for (int i=0;i<arr.length;i++){
            if(b>arr[i]){
                b=arr[i];
                index=i;
            }
        }
        return index;
    }
}