import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        //ax^2 + b >=0
        if (a == 0) {
            if (b >= 0) {
                System.out.print("any x");
            } else {
                System.out.print("no such x");
            }
        } else {          // a !=0
            if (a > 0) {
                if (b <= 0) {
                    if (b == 0) {
                        System.out.print("any x");
                        if (b < 0) {
                            System.out.printf("x<=%.1f or x>=%.1f", (-Math.sqrt(-b / a)), (Math.sqrt(-b / a)));
                        }
                    }
                } else {
                    System.out.print("any x");
                }
            } else {
                    if (b >= 0) {
                        if (b == 0) {
                            System.out.print("0.0");
                        } else {
                            System.out.printf("%.1f<=x<=%.1f", (-Math.sqrt(-b / a)), (Math.sqrt(-b / a)));
                        }
                    } else {
                        System.out.print("no such x");
                    }
                }
            }
        }
    }


