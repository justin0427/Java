package Ch5;
public class Ch5_17 {
    public static void main(String args[]){
        int i ,num=89,sum=0;

        for(i=1;i<=89;i++)
            if (num%i==0)
                sum+=1;
                if (sum>=3)
                System.out.println(num+"不是質數");
                else
                System.out.println(num+"是質數");
    }
}