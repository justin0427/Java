package Ch5;
import java.util.Scanner;
public class Ch5_9 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if(a<=100 && a>=80)
            System.out.println("A級");
            if(a<=79 && a>=60)
            System.out.println("B級");
                if(a<=59) 
                System.out.println("C級");
        scn.close();
    }
}
