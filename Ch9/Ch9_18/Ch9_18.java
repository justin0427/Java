package Ch9.Ch9_18;

class NameCard{
    private String name; 	// name,存放姓名
    private String address;  // address, 存放地址
    private Phone data;	   // Phone 類別，裡面有tel和mobile成員

    class Phone{
        String tel;
        String mobile;

        public  void setPhone(String te,String mob){
            tel=te;
            mobile=mob;
        }
    }
    public Phone getData() {
        return data;
    }
    public NameCard(String na, String ad){
        name = na;
        address = ad;
        data=new Phone();
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Tel: "+data.tel);
        System.out.println("Mobile: "+data.mobile);
    }
}
 
public class Ch9_18 {
    public static void main(String[] args) {
        NameCard tom=new NameCard("Tom","123 City");
        tom.getData().setPhone("345-7612","0971-666000");
        tom.show();
        
    }
}
