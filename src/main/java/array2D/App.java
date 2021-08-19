package array2D;

import java.util.Scanner;

public class App {

    /*
    1. Viết chương trình tìm xem ma trận kích thước m x n có chứa phần tử có giá trị x hay không
    2. Cho trước ma trận a kích thước m x n. Ma trận a có phải là ma trận toàn các số nguyên tố hay không?
    3. Cho trước ma trận a, kích thước m x n. Tìm giá trị lớn nhất trong ma trận (gọi là max)
    4. Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
        a. Dòng d, cột c
        b. Đường chéo chính, đường chéo phụ (ma trận vuông)
        c. Nửa trên/dưới đường chéo chính (ma trận vuông)
        d. Nửa trên/dưới đường chéo phụ (ma trận vuông)
     */

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%5d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
            }
        }
        return ret;
    }

//    public static int sumElements(int[][] a) { //tong phan tu trong matrix
//        int sum = 0;
//        for (int i = 0, r = a.length; i < r; i++) {
//            for (int j = 0, c = a[0].length; j < c; j++) {
//                sum += a[i][j];
//            }
//        }
//        return sum;
//    }

    public static boolean hasElement(int[][] a, int x) {//ma trận mxn có chứa phần tử x không
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("Phần tử " + x + " đầu tiên của matrix ở hàng " + i + " cột " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrime(int m) {//check 1 số có phải nguyên tố không
        if (m < 2) {
            return false;
        }
        for (int i = 2, squareRoot = (int) Math.sqrt(m); i < squareRoot; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMatrix(int[][] a) { //kiểm tra ma trận toàn số nguyên tố
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (!isPrime(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getMaxMatrix(int[][] a) {//giá trị lớn nhất trong ma trận
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int sumElementsRow(int[][] a, int r) { //tính tổng các phần tử trên hàng r
        int sumRow = 0;
        if (r >= a.length) {
            System.out.println("Chi so hang nhap vao vuot qua kich thuoc ma tran!");
            return sumRow;
        }
        for (int i = 0, c = a[r].length; i < c; i++) {
            sumRow += a[r][i];
        }
        return sumRow;
    }

    public static int sumElementsColumn(int[][] a, int c) { //tính tổng các phần tử trên cột c
        int sumCol = 0;
        if (c >= a[0].length) {
            System.out.println("Chi so cot nhap vao vuot qua kich thuoc ma tran!");
            return sumCol;
        }
        for (int i = 0, r = a.length; i < r; i++) {
            sumCol += a[i][c];
        }
        return sumCol;
    }

    public static int sumRowAndCol(int[][] a, int r, int c) {//tính tổng các phần tử của hàng r và cột c
        int sum = 0;
        if (r > a.length && c > a[0].length) {
            System.out.println("Chi so nhap vao vuot qua kich thuoc ma tran!");
            return sum;
        }
        sum += sumElementsRow(a, r);
        sum += sumElementsColumn(a, c);
        sum -= a[r][c];

        return sum;
    }

    public static int sumMainDiagonal(int[][] a) { //tính tổng đường chéo chính của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    public static int sumSencondDiagonal(int[][] a) { //tính tổng đường chéo phụ của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            sum += a[i][c - i - 1];
        }
        return sum;
    }

    public static int sumUpperMainDiagonal(int[][] a) {//tính tổng nửa trên đường chéo chính của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumUnderMainDiagonal(int[][] a) {//tính tổng nửa dưới đường chéo chính của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumUpperSencondDiagonal(int[][] a) { //tính tổng nửa trên đường chéo phụ của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= c - i - 1; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumUnderSencondDiagonal(int[][] a) { //tính tổng nửa dưới đường chéo phụ của ma trận
        int sum = 0;
        int r = a.length, c = a[0].length;
        if (r != c) {
            System.out.println("Ma tran khong phai ma tran vuong!");
            return sum;
        }
        for (int i = 0; i < r; i++) {
            for (int j = c - i - 1; j < c; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
//        int[][] a = generateMatrix(2,2,3,4);
//        printMatrix(a);
//
//        int sum = sumElements(a);
//        System.out.println("Sum = " + sum);;

        //test1: ma trận kích thước m x n có chứa phần tử có giá trị x hay không
        int[][] a = generateMatrix(5, 5, 0, 10);
        printMatrix(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.println(hasElement(a, x));

        //test2: kiểm tra ma trận toàn số nguyên tố
        System.out.println("Mang toan so nguyen to: " + isPrimeMatrix(a));

        //test3:giá trị lớn nhất trong ma trận
        int max = getMaxMatrix(a);
        System.out.println("Max = " + max);

        //test4a: tổng các phần tử trên hàng và cột
        System.out.print("Nhap hang can tinh tong: ");
        int r = sc.nextInt();
        System.out.println("Tong hang " + r + " la: " + sumElementsRow(a, r));

        System.out.print("Nhap cot can tinh tong: ");
        int c = sc.nextInt();
        System.out.println("Tong cot " + c + " la: " + sumElementsColumn(a, c));

        System.out.print("Nhap hang va cot can tinh tong: ");
        r = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Tong hang " + r + " va cot " + c + " la: " + sumRowAndCol(a, r, c));

        System.out.println("============Ma tran vuong=============");
        int[][] b = generateMatrix(4, 4, 0, 10);
        printMatrix(b);

        //test 4b: tổng đường chéo chính, đường chéo phụ (ma trận vuông b)
        System.out.println("Tong duong cheo chinh: " + sumMainDiagonal(b));
        System.out.println("Tong duong cheo phu: " + sumSencondDiagonal(b));

        //test 4c: tổng nửa trên đường chéo chính, đường chéo phụ (ma trận vuông b)
        System.out.println("Tong nua tren duong cheo chinh: " + sumUpperMainDiagonal(b));
        System.out.println("Tong nua duoi duong cheo chinh: " + sumUnderMainDiagonal(b));

        //test 4d: tổng nửa trên đường chéo chính, đường chéo phụ (ma trận vuông b)
        System.out.println("Tong nua tren duong cheo phu: " + sumUpperSencondDiagonal(b));
        System.out.println("Tong nua duoi duong cheo phu: " + sumUnderSencondDiagonal(b));

    }
}
