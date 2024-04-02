package Ch9.Ch9_9;
class MyClip{
    int low=0;
    int high=0;
    public MyClip(int lo,int hi){
        low=lo;
        high=hi;
    }
    public void set_range(int lo, int hi){
        low=lo;
        high=hi;
    }
    public void clip(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<low){
                arr[i]=low;
            }
            else if(arr[i]>high){
                arr[i]=high;
            }
        }
    }
    public void print_arr(int[] arr){
        System.out.print("After clipped:");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%3d ",arr[i]);
        }
        System.out.println();
    }
}
   
public class Ch9_9{
    public static void main(String[] args){
        int[] a={-4,190,300,12,-7,8};
        int[] b={0,2,4,3,6,7};
        MyClip obj=new MyClip(0,255);
        obj.clip(a);
        obj.print_arr(a);
        obj.set_range(3,5);
        obj.clip(b);
        obj.print_arr(b);
    }
}
 