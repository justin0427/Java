package Ch5;
public class Ch5_18 {
    public static void main(String args[]){
        int i ,sum=0;

        for(i=1;i<=50;i++)
            if(i%2==0)
            sum=sum-(i*i);
            else
            sum=sum+(i*i);
        System.out.println(sum);
    }
}