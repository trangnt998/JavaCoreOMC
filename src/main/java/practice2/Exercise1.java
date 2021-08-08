package practice2;

import java.util.Scanner;

public class Exercise1 {
    /*
    1. Nhập một số bất kỳ. Hãy đọc giá trị của số nguyên đó nếu nó có giá trị từ 1 đến 9,
    ngược lại thông báo không đọc được.
     */

    public static void main(String[] args) {
        System.out.print("Nhap mot so nguyen bat ky: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n >= 1 && n <= 9) {
            System.out.print("So vua nhap co gia tri la: " + n);
        } else {
            System.out.print("Khong doc duoc so vua nhap!");
        }
    }

}
