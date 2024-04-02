package Ch5;
public class Ch5_25 {
    public static void main(String args[]){
        int num=0;
        char letter='a';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(Math.abs(j-6));
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(i);
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(num++);
                }else if(i==2){
                    System.out.print(num++);
                }else if(i==3){
                    System.out.print(num++);
                }else if(i==4){
                    System.out.print(num++);
                }else if(i==5){
                    System.out.print(letter++);
                }
            }
            System.out.println();
        }
    }
}