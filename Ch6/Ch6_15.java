package Ch6;
public class Ch6_15 {
    public static void main(String[] args) {
        int[][] arr = {{4, 2}, {3, 4, 6}, {7, 4, 8, 5}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max value: " + max);
    }
}
