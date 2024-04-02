package Ch10.Ch10_10;

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

public class Ch10_10{
    public static void main(String[] args){
        Shape sha[]={new Circle(5.0),
                     new Circle(10.0),
                     new Square(5.0),
                     new Square(10.0),
                     new Triangle(5.0,10.0),
                     new Triangle(10.0,5.0)};

        System.out.printf("Circle1=%.2f\n",sha[0].area());
        System.out.printf("Circle2=%.2f\n",sha[1].area());
        System.out.printf("Square1=%.2f\n",sha[2].area());
        System.out.printf("Square2=%.2f\n",sha[3].area());
        System.out.printf("Triangle1=%.2f\n",sha[4].area());
        System.out.printf("Triangle2=%.2f\n",sha[5].area());

        System.out.printf("Largest area=%.2f\n",largest(sha));
    }
    public  static double largest(Shape[] shapes) {
        double max = 0.0;
        for (Shape shape : shapes) {
            if (shape.area() > max) {
                max = shape.area();
            }
        }
        return max;
    }
}

