package practice5;

import java.util.Scanner;

import static practice5.CheckMangChan_NguyenTo_TangDan.inputIntArray;
import static practice5.CheckMangChan_NguyenTo_TangDan.isPrime;

public class TongSoNguyenTo_SoChiaHetCho4 {
    /*
    3. Các thao tác tính toán
        a. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        b. Tổng các số nguyên tố có trong mảng
     */

    //Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
    public static int div4Not5(int[] intArr) {
        int count = 0;
        for (int i : intArr) {
            if ((i % 4 == 0) && (i % 5 != 0)) {
                count++;
            }
        }
        return count;
    }


    //b. Tổng các số nguyên tố có trong mảng
    public static int sumPrimeArr(int[] intArr) {
        int sumPrime = 0;
        for (int i : intArr) {
            if (isPrime(i)) {
                sumPrime += i;
            }
        }
        return sumPrime;
    }

    public static void main(String[] args) {
        //test
        //a. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        System.out.println("===Kiểm tra mảng có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.");
        System.out.print("Kích thước mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int[] intArr = inputIntArray(n);
            int count = div4Not5(intArr);
            System.out.println(" -> " + count + " số");
        } else {
            System.out.println("Sai du lieu!");
        }

        //3b. Tổng các số nguyên tố có trong mảng
        System.out.println("===Tính tổng các số nguyên tố có trong mảng.");
        System.out.print("Kích thước mảng: ");
        n = sc.nextInt();
        if (n > 0) {
            int[] intArr = inputIntArray(n);
            int sumPrime = sumPrimeArr(intArr);
            System.out.println("-> Tổng các số nguyên tố có trong mảng la: " + sumPrime);
        } else {
            System.out.println("Sai du lieu!");
        }

    }
}
