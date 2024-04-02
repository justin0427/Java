package Ch7;
public class Ch7_3 {
    public static void main(String[] args){
        int a=cubic(5);
        System.out.println("The cube of 5 is: "+a);
    }
    public static int cubic(int x){
        int sum=0;
        sum=x*x*x;
        return sum;
    }
}
