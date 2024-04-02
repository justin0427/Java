package Ch5;
import java.util.Scanner;
public class Ch5_12 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        switch(m){
            case 3:
            System.out.println("春天");
            break;
            case 4:
            System.out.println("春天");
            break;
            case 5:
            System.out.println("春天");
            break;
            case 6:
            System.out.println("夏天");
            break;
            case 7:
            System.out.println("夏天");
            break;
            case 8:
            System.out.println("夏天");
            break;
            case 9:
            System.out.println("秋天");
            break;
            case 10:
            System.out.println("秋天");
            break;
            case 11:
            System.out.println("秋天");
            break;
            case 1:
            System.out.println("冬天");
            break;
            case 2:
            System.out.println("冬天");
            break;
            case 12:
            System.out.println("冬天");
            break;
            default:
            System.out.println("月份不存在");
            break;
        }
        scn.close();
    }
}
