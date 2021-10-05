package practice2;

import java.util.Scanner;

public class Sort4Int {
    //Nhập 4 số nguyên a, b, c và d. Hãy sắp xếp giá trị của 4 số nguyên này theo thứ tự tăng dần.

    public static int[] sort(int[] A) {
        int tmp;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.print("Nhap 4 so nguyen a,b,c,d: ");
        Scanner in = new Scanner(System.in);

        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = in.nextInt();
        }

        int[] A_Sorted = sort(A);
        for (int i = 0; i < A_Sorted.length; i++) {
            System.out.print(A_Sorted[i] + " ");
        }
    }
}
