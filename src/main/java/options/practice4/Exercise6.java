package options.practice4;

import static options.practice4.Exercise1cde.getArrDigitsFromNumber;

public class Exercise6 {
    /*
    6. Tìm và in lên màn hình tất cả các số nguyên trong
        phạm vi từ 10 đến 99 sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó.
     */

    public static boolean isMulEq2Sum(int number){ //tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó (số có 2 chữ số).
        int[] arrDigits = getArrDigitsFromNumber(number);
        return (arrDigits[0] * arrDigits[1]) == (2 * (arrDigits[0] + arrDigits[1]));
    }

    public static void main(String[] args){
        System.out.println("Các số cần tìm là: ");
        for (int i = 10; i <=99; i++){
            if(isMulEq2Sum(i)){
                System.out.print(i + " ");
            }
        }
    }
}
