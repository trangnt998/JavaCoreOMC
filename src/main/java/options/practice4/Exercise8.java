package options.practice4;

import java.util.Scanner;

public class Exercise8 {
    /*
    8. Nhập n. In n số đầu tiên trong dãy Fibonacy.
        a. a0 = a1 = 1
        b. an = an – 1 + an – 2
     */

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void Fibonacci2(int n) {
        int f0 = 1, f1 = 1;
        int f2;

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                System.out.print(1 + " ");
            } else {
                f2 = f1 + f0;
                System.out.print(f2 + " ");
                f0 = f1;
                f1 = f2;
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Nhập 1 so nguyen: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //test1
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(Fibonacci(i) + " ");
            }

            //test2
            System.out.println("\nTest2");
            Fibonacci2(n);
        } else {
            System.out.println("Sai du lieu!");
        }
    }

}
