import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        String s = in.nextLine();


        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        char t = s.charAt(4);
        char g = s.charAt(5);
        int a1 = (int) a - 48;
        int b1 = (int) b - 48;
        int c1 = (int) c - 48;
        int t1 = (int) t - 48;
        int g1 = (int) g - 48;
        int r = c1 - g1;
        if (r < 0) {
            b1 = b1 - 1;
            r = 10 + r;
        }
            int p = b1 - t1;
            if (p < 0) {
                a1 = a1 - 1;
                p = 10 + p;
            }
        if (a1 > 0) {
            System.out.print(a1);
            System.out.print(p);
            System.out.print(r);
        } else if (p > 0) {
            System.out.print(p);
            System.out.print(r);
        } else
            System.out.print(r);
    }
}

