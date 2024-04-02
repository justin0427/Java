package Ch9.Ch9_16;

class Circle{
    private double radius;


    public Circle(double r){
        radius=r;
    }
    public static double compare(Circle[] c){
        double max=0.0;
        for(int i=0;i<c.length;i++){
            if(c[i].radius>max) 
                max=c[i].radius;
        }
      return max;
    }
    public static double average(Circle[] c){
        double sum=0.0;
        for(int i=0;i<c.length;i++){
            sum+=c[i].radius;
        }
        return sum/c.length;
    }
}

public class Ch9_16 {
    public static void main(String[] args){
        Circle[] cir = new Circle[3];
        cir[0] = new Circle(2.0);
        cir[1] = new Circle(3.0);
        cir[2] = new Circle(4.0);
        System.out.println("Largest radius =  "+Circle.compare(cir));
        System.out.println("Average radius =  "+Circle.average(cir));
    }
}
