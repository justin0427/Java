package Ch6;
public class Ch6_7{
    public static void main(String[] args){
        int[] arr={12,15,8,43}; 
        int[] arr1=new int[4];
        int i=0,a=3;
        for(i=0;i<arr.length;i++){
           arr1[i]=arr[a-i];
            } 
        for(i=0;i<arr1.length;i++){
            System.out.printf("arr1[%d]=%d, ",i,arr1[i]);
            } 
    }
}