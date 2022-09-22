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
        int min = arr[0];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                k = i;
            }
        }
        int[] d;
        d = new int[n];
        int i = 0;
        so
        for (int g = 1; g < n; g++) {
            if (i != k) {
                d[g] = arr[i];
                i++;
            } else {
                d[0] = arr[i];
            }
        }
        for (int h = 0; h < d.length; h++) {
            System.out.print(d[h] + " ");
        }

    }
}

