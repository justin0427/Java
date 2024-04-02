package Ch10.Ch10_11;
class Caaa{
    public int n1,n2;
    public Caaa(){	 // 沒有引數的建構子
      n1=n2=1;
    }
    public Caaa(int a,int b){   // 有兩個引數的建構子
       n1=a; n2=b;
    }
    public void show(){
        System.out.println("n1="+n1+" n2="+n2);
    }
}
class Cbbb extends Caaa{
    public Cbbb(){	 
        super();        
    }
    public Cbbb(int a,int b){
        super(a,b);
    }
}
public class Ch10_11 {
    public static void main(String[] args) {
        Cbbb obj1=new Cbbb(10,20);
        obj1.show();
        Cbbb obj2=new Cbbb();
        obj2.show();
    }
}
