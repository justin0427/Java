package Ch6;
public class Ch6_10{
    public static void main(String[] args){
        char chr[]={'H','e','l','l','o'};
        char[] chr1=new char[5];
        for(int i=0;i<chr.length;i++){
            chr1[i] = Character.toUpperCase(chr[i]); 
            } 
        for(int i=0;i<chr1.length;i++){
            System.out.printf("chr1[%d]=%c, ",i,chr1[i]);
            } 
    }
}