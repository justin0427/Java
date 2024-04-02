package Ch10.Ch10_6;

class Circle{
    private static double pi=3.14;	
    protected double radius;			
  
    public void show(){
       System.out.printf("area=%6.2f\n",pi*radius*radius);
    }
    public double get_pi(){
        return pi;
    }
}
class Coin extends Circle{   
    private int value;
 
    public Coin(double r, int v){    
       radius=r;   	
       value=v;      
       System.out.println("radius="+radius+", value="+value);
    } 
    public void print_pi(){
        System.out.println("pi= "+get_pi());
    }
}

public class Ch10_6{
    public static void main(String[] args){
       Coin coin=new Coin(2.5,10);  
       coin.show();
       coin.print_pi();
    }
} 