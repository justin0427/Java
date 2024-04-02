package Ch6;
public class Ch6_4{
    public static void main(String[] args){
        int[] arr={3, 5, 0, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2}; 
        System.out.printf("(a)");
        System.out.printf("arr個數:%d, ",arr.length);
        System.out.printf("(b)");
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=3 && arr[i]<=6){
                count++;
            } 
        }
        System.out.printf("介於3~6之間(包含3和6)的元素共有%d個",count);               
    }
}