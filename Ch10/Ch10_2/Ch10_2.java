package Ch10.Ch10_2;

class Caaa{
    public int n1;
    public int n2;

    public Caaa(){
        n1=1;
        n2=1;
    }
    public Caaa(int a,int b){
        n1=a;
        n2=b;
    }
}

class Cbbb extends Caaa{
    public void set_num(int a,int b){
        n1=a;
        n2=b;
    }
    public void show(){
        System.out.println("n1="+n1+", n2="+n2);
        
    }
    public Cbbb(int a,int b){
        super(a,b);
    }
    public Cbbb(){
        super(); 
    }
}

public class Ch10_2{
    public static void main(String[] args) {
        Cbbb b1 =new Cbbb();
        Cbbb b2 =new Cbbb(3,9);
        b1.show();
        b2.show();
    }
}
