package Ch7;
public class Ch7_28 {
    public static void main(String[] args){
        System.out.println(rsum(5));
    }
    public static int rsum(int n){
        if (n == 1) { 
            return 0;
        }else{
        return (n-1)*n+ rsum(n-1) ;
        }
    }
}