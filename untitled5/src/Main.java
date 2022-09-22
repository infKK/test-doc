import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = -1 * (b / a);
        if (b == 0) {
            if (a == 0) {
                System.out.print("any x");
            } else {
                System.out.print(0.0);
            }
        } else {
            if (a == 0) {
                System.out.print("0.0");
            } else {
                double x1 = 0.0;
                if (x < x1) {
                    System.out.printf("0.0 %.1f", x);
                    System.out.print(" ");
                } else {
                    System.out.printf("0.0 %.1f", x1);
                    System.out.print(" ");
                }
            }
        }

    }
}

