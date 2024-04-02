package Ch9.Ch9_10;

public class Ch9_10{
    public static void main(String[] args){
        Circle c1=new Circle(1.0);
        Circle c2=new Circle(2.0);
        Circle obj;

        obj= compare(c1,c2);
        if (c1==obj)
            System.out.println("radius of c1 is larger");
        else
            System.out.println("radius of c2 is larger");
    }
    public static Circle compare(Circle cir1,Circle cir2){
        if(cir1.radius>cir2.radius)
            return cir1;
        else
            return cir2;
    }   
}
class Circle{
    double radius;
    
    public Circle(double r){
        radius=r;
    }
        
}

 