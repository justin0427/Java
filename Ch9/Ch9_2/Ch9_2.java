package Ch9.Ch9_2;

class Rectangle{
    int width; 
    int height; 
    public Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public Rectangle(){
       this(1,1); 
    }
    public  void show(){
        System.out.println("width="+width+",height="+height);
    }
 }
 
public class Ch9_2{
    public static void main(String[] args){
    Rectangle r1=new Rectangle(3,4);
    r1.show();
    Rectangle r2=new Rectangle();
    r2.show();
    }
}
 