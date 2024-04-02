package Ch9.Ch9_3;
class Caaa{   // 定義類別Caaa
    private int value;
    public Caaa(){   
      this(1);
    }   
    public Caaa(int i){   
       value=i;
    }   
    public void set_value(int n){
        value=n;
    }
    public int get_value(){
        return value;
    }
}
public class Ch9_3{
    public static void main(String[] args){
       Caaa obj1=new Caaa();
       System.out.println(obj1.get_value());
       Caaa obj2=new Caaa(12); 
       System.out.println(obj2.get_value());
       obj1.set_value(100);
       System.out.println(obj1.get_value());
    }
}  
 