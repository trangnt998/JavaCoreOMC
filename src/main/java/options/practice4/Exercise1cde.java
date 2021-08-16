package options.practice4;

import java.util.Scanner;

public class Exercise1cde {
    /*
    1. Nhập một số nguyên dương n (n > 0).
        c. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, ...
        d. Chữ số lớn nhất và nhỏ nhất?
        e. Các chữ số có tăng dần hay giảm dần không?
     */

    public static boolean isPrimeNumber(int number) { //kiem tra so nguyen to
        if (number == 2) {
            return true;
        } else if (number > 2) {
            for (int i = 2; i < number; i++) {//1 khong phai so nguyen to, 2 la so nguyen to...
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static int countNumberOfDigits(int number) { //dem so luong ki tu cua mot so nguyen bat ki
        int lengthNumber = 0;
        if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                number /= 10;
                lengthNumber++;
            }
            return lengthNumber;
        }
    }

    public static int getMinArr(int[] arr) { //lay ra phan tu nho nhat trong mang
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }


    public static int getMaxArr(int[] arr) { //lay ra phan tu lon nhat trong mang
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int[] getArrDigitsFromNumber(int number) {//đưa ra mảng các kí tự của 1 số nguyên
        int[] arrDigits = new int[countNumberOfDigits(number)];
        for (int i = countNumberOfDigits(number) - 1; i >= 0; i--) {
            arrDigits[i] = number % 10;
            number = number / 10;
        }
        return arrDigits;
    }

    public static int[] getMinMaxDigits(int number) {//chữ số lớn nhất và nhỏ nhất cua so nguyen duong n
        int[] minMaxDigits = new int[2];
        int[] arrDigits = getArrDigitsFromNumber(number);
        minMaxDigits[0] = getMinArr(arrDigits);
        minMaxDigits[1] = getMaxArr(arrDigits);

        return minMaxDigits;
    }

    public static boolean isAscArr(int[] arr) { //mang co phai tang dan khong
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescArr(int[] arr) { //mang co phai giam dan khong
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //test
        System.out.print("Nhap so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if (number > 0) {
            //check so nguyen to
            System.out.println("La so nguyen to? -> " + isPrimeNumber(number));


            //check chu so min max cua so nguyen duong n
            int[] arrMinMaxDigits = getMinMaxDigits(number);
            System.out.println("Min Digit: " + arrMinMaxDigits[0]
                    + "\nMax Digit: " + arrMinMaxDigits[1]);


            //Các chữ số có tăng dần hay giảm dần không?
            int[] arrDigits = getArrDigitsFromNumber(number);
            if (isAscArr(arrDigits)) {
                System.out.println("Các chữ số tăng dần.");
            } else if (isDescArr(arrDigits)) {
                System.out.println("Các chữ số giảm dần.");
            } else {
                System.out.println("Khong phai tang dan hay giam dan!");
            }
        } else {
            System.out.println("Sai du lieu!");
        }
    }
}







