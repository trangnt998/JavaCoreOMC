package oop.entities;

public class Utils {
    public static int GCD(int a, int b) {//tim uoc chung lon nhat dùng thuat toan euclid
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
