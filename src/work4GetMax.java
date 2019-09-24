import java.util.Scanner;

public class work4GetMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" введитеА и В ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if ((a % 1 == 0) && (b % 1 == 0)) {
            int c = (int) a;
            int d = (int) b;
            System.out.println(max(c, d));
        } else
            System.out.println(max(a, b));
    }

    public static int max(int c, int d) {
        int mc = c > d ? c : d;
        return (mc);
    }

    public static float max(float c, float d) {
        float mc = c > d ? c : d;
        return (mc);
    }

}