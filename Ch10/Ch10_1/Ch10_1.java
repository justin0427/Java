package Ch10.Ch10_1;

class Caaa{
    public int n1;
    public int n2;
}

class Cbbb extends Caaa{
    public void set_num(int a,int b){
        n1=a;
        n2=b;
    }
    public void show(){
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
    }
}

public class Ch10_1 {
    public static void main(String[] args) {
        Cbbb bb =new Cbbb();
        bb.set_num(5,10);
        bb.show();
    }
}
