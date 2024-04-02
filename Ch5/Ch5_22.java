package Ch5;
public class Ch5_22 {
    public static void main(String args[]){
        int i=1;
        for(i=1;i<=1000;i++)
            
            if(i%3==1 && i%5==3 && i%7==2)
            break;
        System.out.println("最少"+i+"隻");
                
        
        
        
    }
}