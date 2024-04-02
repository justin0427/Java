package Ch5;
import java.util.Scanner;
public class Ch5_5 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        char ch=a.charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("此字元是字母");
        else
            System.out.println("此字元是數字");
        scn.close();
    }
    
}