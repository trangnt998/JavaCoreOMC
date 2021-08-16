package options.practice4;

import java.util.Scanner;

public class Exercise2abc {
    /*
    2. Nhập một số nguyên dương n. Tính:
        a. S = 1 + 2 + ... + n
        b. S = 1^2 + 2^2 + ... + n^2
        c. S = 1 + 1/2 + ... + 1/n
     */

    public static int sum(int number) {//tinh tong các số từ 1 đến n
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

/*
    public static int sumRecursive(int number) {//tinh tong các số từ 1 đến n bằng đệ quy
        if (number == 1) {
            return 1;
        } else {
            return sumRecursive(number - 1) + number;
        }
    }
*/


    public static int sumPowBase2(int number) { //tinh tong luy thua co so 2: 1^2 + 2^2 + ... + n^2
        int sumPow = 0;
        for (int i = 1; i <= number; i++) {
            sumPow += i * i;
        }
        return sumPow;
    }

    public static double sumDiv(int number) {//S = 1 + 1/2 + ... + 1/n
        double sumDiv = 0;
        for (int i = 1; i <= number; i++) {
            sumDiv += 1.0 / i;
        }
        return sumDiv;
    }


    public static void main(String[] args) {
        System.out.print("Nhap mot so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //test
        if (number > 0) {
            //a. S = 1 + 2 + ... + n
            int sum = sum(number);
            System.out.println("Tong 1 + 2 + ... + n = " + sum);
/*
            int sum2 = sumRecursive(number);
            System.out.println(sum);
*/
            //S = 1^2 + 2^2 + ... + n^2
            int sumPowBase2 = sumPowBase2(number);
            System.out.println("Tong luy thua 2: 1^2 + 2^2 + ... + n^2 = " + sumPowBase2);

            //S = 1 + 1/2 + ... + 1/n
            double sumDiv = sumDiv(number);
            System.out.println("Tong 1 + 1/2 + ... + 1/n = " + sumDiv);

        } else {
            System.out.println("Sai du lieu!");
        }


    }

}
