import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            public static Scanner in = new Scanner(System.in);
            public static PrintStream out = System.out;

 int n = in.nextInt();
 for (int i = 2; i<n;i++){
     if(n%i ==0){
         System.out.println("false");
     } else{
         System.out.println("true");
     }
 }



    }
}
