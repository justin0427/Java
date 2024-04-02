package Ch5;
import java.util.Scanner;
public class Ch5_29 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int sum=0;
        do{
            System.out.print("提示，要求使用者輸入密碼:");
            int a=scn.nextInt();
            if (a!=6128){
                System.out.println("密碼輸入錯誤，請重新輸入密碼:");
                sum++;
            }
                if (a==6128){
                System.out.println("密碼輸入正確，歡迎使用本系統！");
                break;
                }else if (sum==3){
                System.out.println("密碼輸入超過三次！");
                break;
                }
        }while(sum<3);
        
        scn.close();
    }
}
