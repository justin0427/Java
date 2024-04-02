package Ch10.Ch10_14;
class Car{
    String owner="Tom";
    final String color="Red";
    final void show(){
       System.out.println("Color:"+color+" Owner:"+owner);
    }
}

class Truck extends Car{
    String owner="Jerry";
    final void show(){
        System.out.println("Color:"+color+" Owner:"+owner);//error
    }
}

public class Ch10_14 {
    public static void main(String[] args) {
        Car c1=new Car();
        Truck t1=new Truck();
        c1.show();
        t1.show();
    }
}
