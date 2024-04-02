package Ch9.Ch9_4;
class MinMax{
    private int[] arr;
    public MinMax(int[] a){
        arr=a;
    }
    public void find_min_max(){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);
    }
 }
 
public class Ch9_4{
    public static void main(String[] args){
        int[] a={12,54,23,17,90};
        MinMax obj=new MinMax(a);
        obj.find_min_max();
    }
}  
 