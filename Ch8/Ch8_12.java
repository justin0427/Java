package Ch8;

class CCircle{
    double pi=3.14;
    double radius;
    
    double area(double r){
        return pi*r*r;
    }
    float area(float r){
        return (float)pi*r*r;
    }
    double area(int r){
        return pi*r*r;
    }
 }
 public class Ch8_12{
    public static void main(String[] args){
       CCircle cc=new CCircle();
       System.out.println(cc.area(2));
       System.out.println(cc.area(2.2f));
       System.out.println(cc.area(2.2));
    }
 }
 