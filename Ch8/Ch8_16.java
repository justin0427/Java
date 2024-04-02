package Ch8;

class CData{
    private String name;	// 姓名
    private String email;	// 電子郵件信箱
    private int mm;    		// 生日的月
    private int dd; 		// 生日的日
    private int yy; 		// 生日的年

    void setName(String n){
        name=n;
    }
    void setEmail(String e){
        email=e;
    }
    void setBirth(int m, int d, int y){
        if (checkDate(m, d, y)) {
            mm = m;
            dd = d;
            yy = y;
        } else {
            System.out.println("日期格式設定錯誤！");
        }
    }
    private boolean checkDate(int m, int d, int y){
        if(y<1900 || y>2099){
            return false;
        }
        if (m==2){
            if(d>28){
                return false;
            }
        }
        if(m<1 || m>12){
            return false;
        }
        if(d<1 || d>31){
            return false;
        }
        return true;
        }
    void setAll(String n, String e, int m, int d, int y){
        name=n;
        email=e;
        mm=m;
        dd=d;
        yy=y;
    }
    void showData(){
        if (checkDate(mm, dd, yy)) {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Birth: "+mm+"/"+dd+"/"+yy);
        }else{
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
            System.out.println("日期格式設定錯誤！");
        }
    }
}

 public class Ch8_16{
    public static void main(String[] args){
       CData tom=new CData();
       CData mary=new CData();
       tom.setName("Tom");
       tom.setEmail("tom@gmail.com");
       tom.setBirth(6,18,2006);
       tom.showData();
       mary.setAll("Mary","mary@gmail.com",2,30,2000);
       mary.showData();
    }
 }