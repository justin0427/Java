package Ch9.Ch9_17;

class Circle{
    private double radius;
    private static double pi = 3.14;

    public Circle(double r){
        radius=r;
    }
   public void show(){
        System.out.printf("area=%6.2f\n",pi*radius*radius);
   }
}

public class Ch9_17{
    public static void main(String[] args){
        Circle[] cir = new Circle[3];
        for(int i=0;i<3;i++){
            cir[i] = new Circle(i+1);
        }
        for(int i=0;i<3;i++){
            cir[i].show();
        }
    }
}
