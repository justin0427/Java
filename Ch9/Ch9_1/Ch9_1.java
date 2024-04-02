package Ch9.Ch9_1;

class Rectangle{
    int width; 
    int height; 
    public Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public Rectangle(){
        width=1;
        height=1;
    }
    public  void show(){
        System.out.println("width="+width+",height="+height);
    }
 }
 
public class Ch9_1{
    public static void main(String[] args){
    Rectangle r1=new Rectangle(3,4);
    r1.show();
    Rectangle r2=new Rectangle();
    r2.show();
    }
}
 