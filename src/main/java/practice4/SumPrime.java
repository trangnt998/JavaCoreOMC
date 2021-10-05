package practice4;

import java.util.Scanner;

public class SumPrime {
    //4. Tính tổng các số nguyên tố nhỏ hơn n (0 < n < 50)

    //check 1 số có phải nguyên tố không
    public static boolean isPrime(int m) {

        if (m == 2) {
            return true;
        } else if (m > 1) { //1 khong phai so nguyen to, 2 la so nguyen to...
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    //Tính tổng các số nguyên tố nhỏ hơn n (0 < n < 50)
    public static int sumPrime(int n) {
        int sum = 0;
        if (n > 0 && n < 50) {
            for (int i = 1; i < n; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1; //trả về -1 nếu đầu vào sai yêu cầu
        }
    }

    public static void main(String[] args) {
        //Test
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n ( 0 < n < 50): ");
        int n = in.nextInt();

        int sumPrim = sumPrime(n);
        if (sumPrim == -1) {
            System.out.println("Sai input!");
        } else {
            System.out.print("Tong cac so nguyen to nho hon " + n + " la " + sumPrim);
        }

    }
}
