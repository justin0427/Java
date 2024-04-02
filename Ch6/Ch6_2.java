package Ch6;
public class Ch6_2{
    public static void main(String[] args){
        int[] a={18,-51, 23,35};
        int[] b={28, 32,-35,40};
        int[] c =new int[4];
        for(int i=0;i<=3;i++){
            if(a[i]>b[i]){
                c[i]=a[i];
            }else{
                c[i]=b[i];
            }
        }
        for(int i=0;i<=3;i++){
            System.out.printf("c[%d]=%d, ",i,c[i]);
        } 
    }
}