package Ch5;
import java.util.Scanner;
public class Ch5_12A {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        char ch=a.charAt(0);
        switch(ch){
            case '狗':
            System.out.println("汪汪叫");
            break;
            case '羊':
            System.out.println("咩咩叫");
            break;
            case '貓':
            System.out.println("喵喵叫");
            break;
            default:
            System.out.println("不明動物");
            break;
        }
        scn.close();
    }
}
