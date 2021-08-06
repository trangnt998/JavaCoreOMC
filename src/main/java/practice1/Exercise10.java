package practice1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = in.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = in.nextInt();

        if(a > b){
            System.out.println("Min la: " + b + "\nMax la: "+a);
        }
        else if(a < b){
            System.out.println("Min la: " + a + "\nMax la: "+b);
        }
        else {
            System.out.println("2 so nhap vao bang nhau!");
        }
    }
}
