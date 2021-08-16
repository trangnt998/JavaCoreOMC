package options.practice4;

import java.util.Scanner;

public class Exercise7 {
    /*
    7. Tìm ước số chung lớn nhất của 2 số nguyên dương a và b nhập từ bàn phím.
     */

    public static int greatestCommonDivisor(int a, int b) { //tim uoc chung lon nhat dùng vòng lặp
        int great = 1;
        if (a > b) {
            for (int i = b; i > 1; i--) {
                if ((b % i == 0) && (a % i == 0)) {
                    return i;
                }
            }
        } else {
            for (int i = a; i > 1; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    return i;
                }
            }
        }
        return great;

    }

    public static int gCD(int a, int b) {//tim uoc chung lon nhat dùng thuat toan euclid
        if (b == 0) {
            return a;
        } else {
            return gCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        //test
        System.out.print("Nhập 2 số nguyên dương a, b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt();

        if (a > 0 && b > 0) {
            int great = greatestCommonDivisor(a, b);
            System.out.println(great);

            //test gCD
            int gCd = gCD(a, b);
            System.out.println(great);
        } else {
            System.out.println("Sai du lieu!");
        }
    }
}
