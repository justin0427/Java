package Ch6;

public class Ch6_21 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={9,8,7,6};
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        System.out.println("陣列 a 的內容：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("陣列 b 的內容：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
