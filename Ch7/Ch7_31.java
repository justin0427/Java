package Ch7;

public class Ch7_31 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 32, 67};
        System.out.println(smallest(arr));
    }

    public static int smallest(int a, int b) {
    return Math.min(a, b);
    }

    public static int smallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
