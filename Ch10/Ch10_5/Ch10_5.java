package Ch10.Ch10_5;

class Triangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base="+base+", height="+height);
    }
    protected Triangle(){
        base=0;
        height=0;
    }
    protected Triangle(int a,int b){
        base=a; 
        height=b;
    }
}

class Data extends Triangle { 
    public Data(int a,int b){
        super(a,b);
    }
    public void area(){
        show();
        System.out.println("area="+(base*height)/2);
    }
}

public class Ch10_5 {
    public static void main(String[] args) {
        Data obj = new Data(3,8);
        obj.area();
    }
}
