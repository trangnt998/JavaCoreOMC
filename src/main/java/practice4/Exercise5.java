package practice4;

import java.util.Scanner;

public class Exercise5 {
    //5. Nhập một số nguyên dương n. Xuất ra số ngược lại. Ví dụ: Nhập 1706  Xuất 6071.

    //tìm số đảo ngược
    public static int[] reverseNum(int n) {
        String str_n = String.valueOf(n);
        int size = str_n.length();

        if (n > 0) {
            int[] reNum = new int[size];
            int i = 0;
            while (n > 0) {
                reNum[i] = n % 10;
                n /= 10;
                i++;
            }
            return reNum;
        } else {
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        //Test
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();

        int[] reverse = reverseNum(n);

        if (reverse.length == 0) {
            System.out.println("Sai input!");
        } else {
            for (int i : reverse) {
                System.out.print(i);
            }
        }

    }

}
