package Ch8;

class Circle{        // 定義類別Circle
    double pi=3.14; 
    double radius;
    
    void show_periphery(){   // show_periphery(), 顯示出圓周長
       System.out.println("periphery="+2*pi*radius);
    }
 }
 
public class Ch8_6 {
    public static void main(String[] args){ 
        Circle c1 =new Circle();
        c1.radius=3.0;
        c1.show_periphery();
     }
}

