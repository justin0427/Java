package Ch8;

class CCalculator{
    int a;
    int b;
    void set_values(int a1,int b1){
        a=a1;
        b=b1;
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+add());
        System.out.println("a-b="+sub());
        System.out.println("a*b="+mul());
        System.out.println("(a+b)/2="+avg());
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    double avg(){
        return (a+b)/2.0;
    }
}

public class Ch8_8 {
    public static void main(String[] args){ 
        CCalculator obj =new CCalculator();
        obj.set_values(5, 12);
        obj.show();
     }
}

