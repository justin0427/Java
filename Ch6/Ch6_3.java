package Ch6;
public class Ch6_3{
    public static void main(String[] args){
        int[] arr={53,27,69,12,3,96} ;
        System.out.printf("(a)");
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d, ",i,arr[i]);
        } 
       
        int a=0,b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                a+=1;
            }else{
                b+=1;
            }
        } 
        System.out.print("(b)");
        System.out.printf("arr偶數有%d個, ",a);
        System.out.printf("arr奇數有%d個 ",b);
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                if(arr[i]>c){
                    c=arr[i];
                }
            }
        }
        System.out.print("(c)");
        System.out.printf("arr奇數最大值:%d ",c);
        int d=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                if(arr[i]>d){
                    d=arr[i];
                }
            }
        }
        System.out.print("(d)");
        System.out.printf("arr奇數最大值:%d ",d);
    }
}