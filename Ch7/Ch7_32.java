package Ch7;

public class Ch7_32 {
    public static void main(String[] args) {
        System.out.printf("%d",area(2));
        System.out.println();
        System.out.printf("%.2f",area(2.3));
    }

    public static int area(int r) {
    return (int)3.14 * r * r;
    }

    public static double area(double r) {
        return 3.14 * r * r;
    }
}
