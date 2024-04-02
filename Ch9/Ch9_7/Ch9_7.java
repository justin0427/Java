package Ch9.Ch9_7;
class Summation{
     
public static void add(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
        }
    System.out.printf("1+2+...+%d=%d",n,sum);
    System.out.println();
    }
}
   
 public class Ch9_7{
    public static void main(String[] args){
        Summation.add(5);
        Summation.add(10);

    }
}
 