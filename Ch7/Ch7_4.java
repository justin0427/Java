package Ch7;
public class Ch7_4 {
    public static void main(String[] args){
        int a=sum(10);
        System.out.println(a);
    }
    public static int sum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum+=i;
        }
        return sum;
    }
}