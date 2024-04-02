package Ch6;

public class Ch6_14 {
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                    {4,5,6}};
        int arr1[][]={{0,0,0},
                    {0,0,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[i][j]=arr[i][j]*arr[i][j];
            }
        }
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}