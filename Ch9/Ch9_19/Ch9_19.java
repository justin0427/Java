package Ch9.Ch9_19;
class Data{
    private String name;
    private Test score;

    class Test{
        int math;
        int english;
        public void setTest(int eng, int ma){
            english = eng;
            math = ma;
        }
        public double avg(){
          return  (double)(english+math)/2;
        }
    }
    
    public Data(String na, int eng, int ma){
        name=na;
        score = new Test();
        score.setTest(eng, ma);
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("English: "+score.english);
        System.out.println("Math: "+score.math);
        System.out.println("average: "+score.avg());
    }
    
}
 
public class Ch9_19 {
    public static void main(String[] args) {
        Data stu=new Data("Annie",85,92);
        stu.show();

    }
}
