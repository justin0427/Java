package Ch8;

class CWin{
    int width;
    int height;
    String name;
    
    void setW(int w){  // 設定寬度的函數      
         width=w;
    }
    void setH(int h){  // 設定高度的函數       
         height=h;
    }
    void setName(String s){  // 設定視窗名稱的函數   
        name=s;
    }
    void setWindows(int w, int h){
        width=w;
        height=h;
    }
    void setWindows(int w, int h,String s){
        width=w;
        height=h;
        name=s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }    
 }
 public class Ch8_11{
    public static void main(String[] args){
       CWin cw=new CWin();
       cw.setName("My Windows");
       cw.setW(5);
       cw.setH(3);
       cw.show();
    }
 }
 