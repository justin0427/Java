package Ch9.Ch9_12;

class Fraction{   // 分數類別   
    private int num,den;
    public void setN(int n) { 	// 設定分子      
     num=n;
    }
    public void setD(int d){		// 設定分母     
       den=d; 
    }      
    public Fraction(int n,int d){
        num=n;
        den=d;  
    }
    public void setND(int num, int den){
        this.num=num;
        this.den=den;
    }
    public int getN(){
        return num;
    }
    public int getD(){
        return den; 
    }
}
public class Ch9_12{
    public static void main(String[] args){
        Fraction f=new Fraction(5,3);
        show(f);
    }
    public static void show(Fraction fraction) {
        System.out.println(fraction.getN() + "/" + fraction.getD());
    }
}