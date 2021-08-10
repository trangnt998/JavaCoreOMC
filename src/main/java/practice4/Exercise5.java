package practice4;

import java.util.Scanner;

public class Exercise5 {
    //5. Nhập một số nguyên dương n. Xuất ra số ngược lại. Ví dụ: Nhập 1706  Xuất 6071.

    //tìm số đảo ngược
    public static int reverseNum(int n) {
        if (n > 0) {
            int reNum = 0;
            while (n > 0) {
                reNum = reNum * 10 + (n % 10);
                n /= 10;
            }
            return reNum;
        } else {
            return -1; //trả về -1 nếu đầu vào sai
        }
    }

    public static void main(String[] args) {
        //Test
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();

        int reverse = reverseNum(n);
        System.out.println(reverse);
    }

}
