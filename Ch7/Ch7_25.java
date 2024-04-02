package Ch7;
public class Ch7_25 {
    public static void main(String[] args){
        System.out.println("(a)"+fib_for(50));
        System.out.println("(b)"+fib_rec(50));
    }
    public static long fib_for(int n){
        long a=0;
        long b=1;
        long c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static long fib_rec(int n){
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fib_rec(n - 1) + fib_rec(n - 2);
        }
    }
}
