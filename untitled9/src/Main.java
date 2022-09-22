
	// Ввести с клавиатуры натуральное число n.
        //
        //Создать массив из n элементов.
        //
        //Введите значения элементов массива с клавиатуры.
        //
        //Минимальный элемент массива (первый минимальный) поставить на первое место, а остальные сдвинуть на освободившееся место (с сохранением их порядка).
        //
        //Вывести на экран результирующий массив.
        import java.io.PrintStream;
import java.util.Scanner;
        public class Main {
            public static Scanner in = new Scanner(System.in);
            public static PrintStream out = System.out;
            public static void main(String[] args) {
                int n = in.nextInt();
                int c = 0;
                int [] arr;
                arr = new int [n];
                for (int i = 0; i < n; i++) {
                    int a = in.nextInt();
                    arr[i] = a;
                }
                int max = arr [0];
                int u = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        u = i;
                    }
                    }

                for(int t = 0; t<k; t++){
                    arr[k-t]= arr[k-t-1];
                }
                arr[0] = max;
                for (int i = 0 ; i < arr.length ; i++){
                    System.out.print(arr[i] + " ");
                }

            }}





