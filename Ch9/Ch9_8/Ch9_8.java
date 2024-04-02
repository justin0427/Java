package Ch9.Ch9_8;
import java.lang.Math;
class myMath{
    int pow;
    public void mypower(int x, int n){
    pow=(int)Math.pow(x,n);
    System.out.printf("%d的%d次方=%d\n",x,n,pow);
    }
}
   
public class Ch9_8{
    public static void main(String[] args){
        myMath p1=new myMath();
        myMath p2=new myMath();
        p1.mypower(2,5);
        p2.mypower(3,4);
    }
}
 