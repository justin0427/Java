package Ch8;

class CTest{
    int a;
    void test(){
        if(a==0){
            System.out.println("此數為零");
        }else if(a%2!=0){
            System.out.println("此數為奇數");
        }else if(a%2==0){
            System.out.println("此數為偶數");
        }
    }
}

public class Ch8_7 {
    public static void main(String[] args){ 
        CTest num =new CTest();
        num.a=8;
        num.test();
     }
}

