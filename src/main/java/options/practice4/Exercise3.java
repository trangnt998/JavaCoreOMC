package options.practice4;

import java.util.Scanner;

public class Exercise3 {
    /*
    3. Nhập 3 số nguyên a, b và n với a, b < n. Tính tổng
        các số nguyên dương nhỏ hơn n chia hết cho a nhưng không chia hết cho b.
     */

    public static void main(String[] args) {
        System.out.print("Nhập 3 số nguyên a, b và n với a, b < n: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt(),
            n = sc.nextInt();

        int sum = 0;
        if ((n > 0 && a > 0 && b > 0) && (n > a && n > b)) {
            for (int i = 1; i < n; i++) {
                if ((i % a == 0) && (i % b != 0)) {
                    sum += i;
                }
            }
            System.out.println("Tong can tim la: " + sum);
        } else {
            System.out.println("Sai du lieu!");
        }

    }


}
