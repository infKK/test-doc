import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }

        int s=0;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                s = i;
            }
        }

        int[] d;
        d = new int[n];
        int i = 0;
        d[0] = min;
        int u = 0;
        for (int g = 1; g < n; g = g + 1 + u) {
            if (g != s + 1) {
                if( g != s+2){
                d[g] = arr[g - 1];
            } else {
                    u = 1;
                }
                }
        }
        for (int h = 0; h < d.length; h++) {
            System.out.print(d[h] + " ");

        }
    }
}
