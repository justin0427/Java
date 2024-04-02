package Ch5;
public class Ch5_27{
    public static void main(String args[]){
        int i ;

        for(i=1;i<=100;i++){
            if(i%2==0 && i%3==0 && i%12!=0)
            System.out.println(i);    
            continue;    
        }
    }
}