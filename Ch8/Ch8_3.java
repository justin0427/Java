package Ch8;

class Cddd{
    String name;
    double height;
    double weight;
 }
 
public class Ch8_3 {
    public static void main(String[] args) {
        Cddd student = new Cddd();
        student.name = "Sandy";
        student.height = 1.655;
        student.weight = 58.2;
        System.out.println(student.name+"的BMI:"+(student.weight/(student.height*student.height)));
    }
}