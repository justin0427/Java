package Ch10.Ch10_16;

class Rectangle{
    protected int width;   
    protected int height;
    
    public Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public String toString(){
        String str="width="+width+" ,height="+height+" ,area="+width*height;
        return str;
    }
}
public class Ch10_16 {
    public static void main(String[] args) {
    Rectangle rect = new Rectangle(20, 60);
    System.out.println(rect.toString());
    }
}