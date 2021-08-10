package practice4;

import java.util.Scanner;

public class Exercise1 {
    /*
    1. Nhập một số nguyên dương n (n > 0).
        Hãy cho biết:
        a. Có phải là số đối xứng? Ví dụ: 121, 12321, ...
        b. Có phải là số chính phương? Ví dụ: 4, 9, 16, ...
     */

    //a. Có phải là số đối xứng? Ví dụ: 121, 12321, ...
    public static boolean isSymmetricalNumber(int n) {
        int n1 = n;
        int n2 = 0;
        while (n1 > 0) {
            n2 = n2 * 10 + (n1 % 10);
            n1 /= 10;
        }
        return n > 0 && n == n2; //trả về true nếu n==n2 và false nếu n != n2 với đk n nguyên dương
    }


    //b. Có phải là số chính phương? Ví dụ: 4, 9, 16, ...
    public static boolean isSquareNumber(int n) { //cách 1
        if (n > 0) {
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (i * i == n) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

/*

    //b. Có phải là số chính phương? Ví dụ: 4, 9, 16, ...
    public static boolean isSquareNumber(int n) { //cách 2
        if (n > 0) {
            int sqrt_n = (int) Math.floor(Math.sqrt(n));
            return sqrt_n * sqrt_n == n;
        } else {
            return false;
        }
    }

*/

    public static void main(String[] args) {
        //Test
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap n de kiem tra so doi xung: ");
        int n = in.nextInt();
        boolean checkSysm = isSymmetricalNumber(n);
        System.out.print(checkSysm);

        System.out.print("\nNhap n de kiem tra so chinh phuong: ");
        n = in.nextInt();
        boolean checkSquare = isSquareNumber(n);
        System.out.print(checkSquare);
    }
}
