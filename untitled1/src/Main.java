
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        char r = s.charAt(4);
        char o = s.charAt(5);
        char t = s.charAt(6);
        int e = (int) a - 48;
        int f = (int) b - 48;
        int n = (int) c - 48;
        int m = (int) r - 48;
        int g = (int) o - 48;
        int y = (int) t - 48;
        if (e == m) {
            if (f == g) {
                if ( n == y) {
                    System.out.println("=");
                } else if (n>y) {
                    out.println(">");
                } else
                    out.println("<");
            } else if (f > g) {
                out.println(">");
            } else
                out.println("<");

        } else if (e>m) {
            out.println(">");
        } else
            out.println("<");


    }
}