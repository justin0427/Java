package Ch10.Ch10_9;

class Shape{
    public double area(){
        return 0.0;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double r){
        radius=r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }        
}
class Square extends Shape{
    double side;
    public Square(double s){
        side=s;
    }
    public double area(){
        return side*side;
    }
}
class Triangle extends Shape{
    double height,base;
    public Triangle(double h,double b){
        height=h;
        base=b;
    }
    public double area(){
        return 0.5*base*height;
    }
}

public class Ch10_9{
    public static void main(String[] args){
        Circle c1=new Circle(5.0);
        Circle c2=new Circle(10.0);
        Square s1=new Square(5.0);
        Square s2=new Square(10.0);
        Triangle t1=new Triangle(5.0,10.0);
        Triangle t2=new Triangle(10.0,5.0);
        double a[]={c1.area(),c2.area(),s1.area(),s2.area(),t1.area(),t2.area()};

        System.out.printf("Circle1(%.1f)=%.2f\n",c1.radius,a[0]);
        System.out.printf("Circle2(%.1f)=%.2f\n",c2.radius,a[1]);
        System.out.printf("Square1(%.1f)=%.2f\n",s1.side,a[2]);
        System.out.printf("Square2(%.1f)=%.2f\n",s2.side,a[3]);
        System.out.printf("Triangle1(%.1f,%.1f)=%.2f\n",t1.height,t1.base,a[4]);
        System.out.printf("Triangle2(%.1f,%.1f)=%.2f\n",t2.height,t2.base,a[5]);

        System.out.printf("Largest area=%.2f\n",largest(a));
    }
    public static double largest(double a[]){
        double max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}

