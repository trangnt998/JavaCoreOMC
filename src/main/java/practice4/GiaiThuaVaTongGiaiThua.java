package practice4;

import java.util.Scanner;

public class GiaiThuaVaTongGiaiThua {
    /*
    2. Nhập một số nguyên dương n. Tính:
        d. S = 1*2*...*n = n!
        e. S = 1! + 2! + ... + n!
     */

    //d. S = 1*2*...*n = n!
    public static int factorial(int n) {
        int fac = 1;
        int n1 = n;
        if (n > 0) {
            while (n1 > 0) {
                fac *= n1;
                n1--;
            }
            return fac;
        } else {//0! = 1 nhưng đề chỉ nhận số > 0 nên bỏ qua case này, coi như input không hợp lệ
            return -1; //nghĩa là đầu vào la so am thì trả về -1
        }
    }

    //e. S = 1! + 2! + ... + n!
    public static int sumFactorial(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += factorial(i);
            }
            return sum;
        } else {
            return -1; //trả về -1 nếu đầu vào sai
        }

    }

    public static void main(String[] args) {
        //Test
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();

        int fact = factorial(n);
        int sumFact = sumFactorial(n);

        //d. S = 1*2*...*n = n!
        if (fact == -1) {
            System.out.println("Sai input!");
        } else {
            System.out.println(n + "! = " + fact);
        }

        //e. S = 1! + 2! + ... + n!
        if (sumFact == -1) {
            System.out.println("Sai input!");
        } else {
            System.out.println("1! + ... + " + n + "!= " + sumFact);
        }
    }

}
