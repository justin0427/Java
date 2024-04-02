package Ch7;
public class Ch7_23 {
    public static void main(String[] args){
        int[][] arr={{1, 3, 5},{8, 9,2}};
        square(arr);
    }
    public static void square(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=arr[i][j]*arr[i][j];
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}