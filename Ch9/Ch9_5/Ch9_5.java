package Ch9.Ch9_5;
class Average{
    private int[][] arr;
    private double avg;
    public Average(int[][] a){
        arr=a;  
        double sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                count++;
            }
        }
        avg=sum/count;
    }
    public void print_avg(){
        System.out.printf("Average = %.2f\n",avg);
    }
    public void print_arr(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
 }
 
public class Ch9_5{
    public static void main(String[] args){
        int[][] a={{12,54,23},{21,12,25}};
        Average obj=new Average(a);
        obj.print_avg();
        obj.print_arr();

    }
}  
 