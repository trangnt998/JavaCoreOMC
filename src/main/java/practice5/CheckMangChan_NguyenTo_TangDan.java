package practice5;

import java.util.Scanner;

public class CheckMangChan_NguyenTo_TangDan {
    /*
    2. Các thao tác kiểm tra
        a. Mảng có phải là mảng toàn chẵn
        b. Mảng có phải là mảng toàn số nguyên tố
        c. Mảng có phải là mảng tăng dần
     */

    public static int[] inputIntArray(int n) { //nhập mảng gồm n số nguyên
        int[] intArr = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        return intArr;
    }

    public static boolean isAllEven(int[] intArr) { // kiểm tra mảng toàn số chẵn
        for (int j : intArr) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //check 1 số có phải nguyên tố không
    public static boolean isPrime(int m) {
        if (m == 2) {
            return true;
        } else if (m > 2) { //1 khong phai so nguyen to, 2 la so nguyen to...
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //kiểm tra mảng toàn số nguyên tố
    public static boolean isAllPrime(int[] intArr) {
        for (int i : intArr) {
            if (!isPrime(i)) {
                return false;
            }
        }
        return true;
    }

    //kiểm tra mảng tăng dần
    public static boolean isAscArr(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] > intArr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //test
        //a. Mảng có phải là mảng toàn chẵn
        System.out.println("===Kiểm tra mảng toàn số chẵn.");
        System.out.print("Kích thước mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int[] intArr = inputIntArray(n);
            boolean checkEvenArr = isAllEven(intArr);
            System.out.println("Mảng toàn số chẵn? -> " + checkEvenArr);
        } else {
            System.out.println("Sai du lieu!");
        }

        //b. Mảng có phải là mảng toàn số nguyên tố
        System.out.println("===Kiểm tra mảng toàn số nguyên tố.");
        System.out.print("Kích thước mảng: ");
        n = sc.nextInt();
        if (n > 0) {
            int[] intArr = inputIntArray(n);
            boolean checkPrimeArr = isAllPrime(intArr);
            System.out.println("Mang toan so nguyen to? -> " + checkPrimeArr);
        } else {
            System.out.println("Sai du lieu!");
        }

        //c. Mảng có phải là mảng tăng dần
        System.out.println("===Kiểm tra mảng tăng dần.");
        System.out.print("Kích thước mảng: ");
        n = sc.nextInt();
        if (n > 0) {
            int[] intArr = inputIntArray(n);
            boolean checkAscArr = isAscArr(intArr);
            System.out.println("Mang tang dan? -> " + checkAscArr);
        } else {
            System.out.println("Sai du lieu!");
        }

    }
}
