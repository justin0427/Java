package Ch9.Ch9_6;
class Count{
    private static int cnt=0;
    public Count(){
        cnt++;
    }
    public void setZero(){
        cnt=0;
    }
    public void setValue(int n){
        cnt=n;
    }
    public void show(){
        System.out.println("Count is "+cnt);
    }
}

public class Ch9_6{
    public static void main(String[] args){
        Count c1=new Count();
        c1.show();
        Count c2=new Count();
        c2.show();
        Count c3=new Count();
        c3.setZero();
        c3.show();
        c3.setValue(10);
        c3.show();
    }
}  
 