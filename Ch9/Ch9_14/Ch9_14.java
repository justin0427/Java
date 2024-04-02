package Ch9.Ch9_14;

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
    public int getN(){
        return num;
    }
    public int getD(){
        return den; 
    }
    public static Fraction compare(Fraction f1, Fraction f2){
        if(f1.num*f2.den>f2.num*f1.den){
            return f1;
        }
        else
            return f2;
    }
 }
public class Ch9_14{
    public static void main(String[] args){
        Fraction f1=new Fraction(2,3);
        Fraction f2=new Fraction(1,2);
        Fraction f3;
        f3=Fraction.compare(f1,f2);
        f3.show();
    }
}