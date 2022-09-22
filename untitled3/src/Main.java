import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double a = in.nextDouble();
        double b= in.nextDouble();
        if (a != 0) {
            if (b == 0) {
                System.out.print(0.0);
            } else {
                    double x = -1 * (b / a);
                    System.out.print(x);
                }
        } else {
            if (b == 0) {
                System.out.print("any x");
            } else {
                System.out.print("no such x");
            }
        }
    }
}

