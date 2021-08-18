package array2D;

import java.util.Scanner;

public class App {

    /*
    1. Viết chương trình tìm xem ma trận kích thước m x n có chứa phần tử có giá trị x hay không
    2. Cho trước ma trận a kích thước m x n. Ma trận a có phải là ma trận toàn các số nguyên tố hay không?
    3. Cho trước ma trận a, kích thước m x n. Tìm giá trị lớn nhất trong ma trận (gọi là max)
     */

    public static void printMatrix(int[][] a){
        for (int i = 0, r = a.length; i < r; i++){
            for (int j = 0, c = a[0].length; j < c; j++){
                System.out.format("%5d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max){
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ret[i][j] = (int) Math.floor(Math.random()*(max-min) + min);
            }
        }
        return ret;
    }

    public static int sumElements(int[][] a){
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++){
            for (int j = 0, c = a[0].length; j < c; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static boolean hasElement(int[][] a, int x){//ma trận mxn có chứa phần tử x không
        for (int i = 0, r = a.length; i < r; i++){
            for (int j = 0, c = a[0].length; j < c; j++){
                if(a[i][j] == x){
                    System.out.println("Phần tử x đầu tiên của matrix ở hàng " + i +" cột " + j);
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
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMatrix(int[][] a){ //kiểm tra ma trận toàn số nguyên tố
        for (int i = 0, r = a.length; i < r; i++){
            for (int j = 0, c = a[0].length; j < c; j++){
                if(!isPrime(a[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    public static int getMaxMatrix(int[][] a){//giá trị lớn nhất trong ma trận
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++){
            for (int j = 0, c = a[0].length; j < c; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args){
//        int[][] a = generateMatrix(2,2,3,4);
//        printMatrix(a);
//
//        int sum = sumElements(a);
//        System.out.println("Sum = " + sum);;

        //test1: ma trận kích thước m x n có chứa phần tử có giá trị x hay không
        int[][] a = generateMatrix(5,5,0,10);
        printMatrix(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println(hasElement(a, x));


        //test2: kiểm tra ma trận toàn số nguyên tố
        System.out.println("Mang toan so nguyen to: " + isPrimeMatrix(a));

        //test3:giá trị lớn nhất trong ma trận
        int max = getMaxMatrix(a);
        System.out.println("Max = " + max);

    }
}
