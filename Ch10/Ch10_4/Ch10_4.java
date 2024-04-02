package Ch10.Ch10_4;

class Caaa{
    private int num;

    public Caaa(int n) {
        num=n;
    }
    public int get(){
        return num;
    }
}
class Cbbb extends Caaa{
    public void show() {
        System.out.println("num="+get());
    }
    public Cbbb(int n) {
        super(n);
    }
}

public class Ch10_4 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2);//原題Cbbb沒有繼承Caaa的設定num，在此解中17-19行加入繼承並可順利執行
        bb.show();
    }    
}
