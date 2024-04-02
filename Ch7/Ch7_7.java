package Ch7;
public class Ch7_7 {
    public static void main(String[] args){
      is_even(100,2);
        
    }
    public static void  is_even(int n,int even){
        for(int i=1;i<=n;i++){
            if (i%even==0 && i%9==0){
            System.out.print(i+" ");
            }
        }
    }
}