package Ch5;
import java.util.Scanner;
public class Ch5_8 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if(a%5==0 && a%6==0)
            System.out.println("可被5和6同時整除");
        else
            System.out.println("無法被5和6同時整除");
        scn.close();
    }
}
