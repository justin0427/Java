package Ch6;

public class Ch6_17 {
    public static void main(String[] args) {
        int[][][] arr={{{15,85,36},{30,14,37},
                        {47,23,96},{19,39,51}},
                        {{22,16,51},{97,30,12},
                         {68,77,26},{57,32,76}}};
        int min=arr[0][0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    if (arr[i][j][k]<min){
                    min=arr[i][j][k];
                    }
                }
            }
        }
        System.out.print(min);
    }
}
