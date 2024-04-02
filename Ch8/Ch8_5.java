package Ch8;
class CBox{
    int length;
    int width;
    int height;

    int volume(){
        return length * width * height;
    }
    int surfaceArea(){
        return 2*(length*width + length*height + width*height);
    }
    void showData(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
    void showAll(){
        showData();
        System.out.println("Volume: "+volume());
        System.out.println("Surface Area: "+surfaceArea());
    }
}

public class Ch8_5 {
    public static void main(String[] arge){ 
        CBox box=new CBox();
        box.length=1;
        box.width=1;
        box.height=1;
        box.showAll();
     }
}
