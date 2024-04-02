package Ch10.Ch10_8;

class Caaa{}
class Cbbb extends Caaa{}
class Cccc extends Cbbb{}
public class Ch10_8 {
    public static void main(String[] args) {
        //Cbbb b1=new Cbbb();
        //Cbbb b2=new Cccc();
        //Cccc c1=new Caaa();//Type mismatch: cannot convert from Caaa to Cccc
        //Cccc c2=new Cbbb();//Type mismatch: cannot convert from Cbbb to Cccc
    }
}
//改寫是單向的，只能從父類別到子類別，不能反過來。