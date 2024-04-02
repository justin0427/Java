package Ch10.Ch10_12;

class Rectangle {
    private int length;
    private int width;

    private void show(){
        System.out.print("length="+length);
        System.out.print(", width="+width);
    }
    public Rectangle(){
        length=2;
        width=2;
    }
    public Rectangle(int len,int wid){
        length=len;
        width=wid;
    }
    public void area(){
        show();
        System.out.printf(", area=%d\n",length*width);
    }
}

class Data extends Rectangle{
    public Data(){
        super();
    }
    public Data(int len,int wid){
        super(len,wid);
    }
}

public class Ch10_12 {
    public static void main(String[] args) {
        Data obj1=new Data(3,8);
        Data obj2=new Data();
        obj1.area();
        obj2.area();
    }
}
