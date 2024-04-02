package Ch9.Ch9_13;

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
    public  Fraction add(Fraction f){
        int newNum = num * f.den + f.num * den;
        int newDen = den * f.den;
        return new Fraction(newNum, newDen);
    }
}
public class Ch9_13{
    public static void main(String[] args){
        Fraction f1=new Fraction(3,5);
        Fraction f2=new Fraction(1,4);
        Fraction result= f1.add(f2);
        result.show();
    }
}