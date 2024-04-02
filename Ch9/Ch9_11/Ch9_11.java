package Ch9.Ch9_11;

class Fraction{   // 分數類別   
    private int num,den;
    public void setN(int n) { 	// 設定分子      
     num=n;
    }
    public void setD(int d){		// 設定分母     
       den=d; 
    }      
    public void show(){
       System.out.println(num+"/"+den);   // 顯示分數
    }
    public Fraction(int n,int d){
        num=n;
        den=d;  
    }
    public void setND(int num, int den){
        this.num=num;
        this.den=den;
    }
}
 
public class Ch9_11{
    public static void main(String[] args){
        Fraction f=new Fraction(5,3);
        f.show();
        f.setN(7);
        f.setD(12);
        f.show();
        f.setND(100,120);
        f.show();
    }
}
 