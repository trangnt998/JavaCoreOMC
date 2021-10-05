package practice2;

import java.util.Collections;
import java.util.Scanner;

public class MinOf4Int {
    //5. Nhập 4 số nguyên a, b, c và d. Tìm số có giá trị nhỏ nhất (min).

    public static int getMin(int[] A) {
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print("Nhap 4 so nguyen a,b,c,d: ");
        Scanner in = new Scanner(System.in);

        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = in.nextInt();
        }

        int min = getMin(A);
        System.out.println("Min = " + min);
    }
}
