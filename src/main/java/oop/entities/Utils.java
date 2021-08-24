package oop.entities;

public class Utils {
    public static int gCD(int a, int b) {//tim uoc chung lon nhat dùng thuat toan euclid
        if (b == 0) {
            return a;
        } else {
            return gCD(b, a % b);
        }
    }
}
