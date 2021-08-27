package oop.entities;

import static oop.entities.Utils.GCD;

public class Fraction {
    /*
    Khai báo kiểu dữ liệu phân số (PHANSO)
    Nhập/Xuất phân số
    Rút gọn phân số
    Tính tổng, hiệu, tích, thương hai phân số
    Kiểm tra phân số tối giản
    Quy đồng hai phân số
    Kiểm tra phân số âm hay dương
    So sánh hai phân số
     */

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
    }

    public boolean isFraction() { //kiểm tra phân số có tồn tại không (mẫu khác 0)
        if (this.denominator == 0) {
            System.out.println("Khong ton tai!");
            return false;
        }
        return true;
    }

    public void printFraction() {
        if (isFraction()) {
            if (this.numerator == this.denominator) {
                System.out.println(1);
            } else if (this.numerator == 0) {
                System.out.println(0);
            } else {
                System.out.format("%d/%d\n", this.numerator, this.denominator);
            }
        }
    }


    public Fraction reduceFraction() { //rút gọn phân số
        Fraction fraction = new Fraction();
        if (isFraction()) {
            int GCD = GCD(this.numerator, this.denominator);
            fraction.numerator = this.numerator / GCD;
            fraction.denominator = this.denominator / GCD;
        }
        return fraction;
    }

    public Fraction addFraction(Fraction fract) { //cộng 2 phân số
        Fraction fraction = new Fraction();
        if (isFraction()) {
            fraction.numerator = this.numerator * fract.denominator + fract.numerator * this.denominator;
            fraction.denominator = this.denominator * fract.denominator;
        }
        return fraction.reduceFraction();
    }

    public Fraction subFraction(Fraction fract) { //trừ 2 phân số
        Fraction fraction = new Fraction();
        if (isFraction()) {
            fraction.numerator = this.numerator * fract.denominator - fract.numerator * this.denominator;
            fraction.denominator = this.denominator * fract.denominator;
        }
        return fraction.reduceFraction();
    }

    public Fraction mulFraction(Fraction fract) { //tích 2 phân số
        Fraction fraction = new Fraction();
        if (isFraction()) {
            fraction.numerator = this.numerator * fract.numerator;
            fraction.denominator = this.denominator * fract.denominator;
        }
        return fraction.reduceFraction();
    }

    public Fraction divFraction(Fraction fract) { //thương 2 phân số
        Fraction fraction = new Fraction();
        if (isFraction()) {
            fraction.numerator = this.numerator * fract.denominator;
            fraction.denominator = this.denominator * fract.numerator;
        }
        return fraction.reduceFraction();
    }

    public boolean isReduceFraction() { //kiểm tra xem có phải phân số tối giản không
        if (isFraction()) {
            if (Math.abs(GCD(this.numerator, this.denominator)) == 1) {
                return true;
            }
        }
        return false;
    }

    //Quy đồng hai phân số
    public Fraction[] isomerizateFraction(Fraction fract) {//quy đồng 2 phân số
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        fraction1.numerator = this.numerator;
        fraction1.denominator = this.denominator;
        fraction1 = fraction1.reduceFraction();
        fraction2 = fract.reduceFraction();

        int GCDdeno = GCD(fraction1.denominator, fraction2.denominator);
        int deno = fraction1.denominator * fraction2.denominator / GCDdeno;
        fraction1.numerator = fraction1.numerator * fraction2.denominator / GCDdeno;
        fraction2.numerator = fraction2.numerator * fraction1.denominator / GCDdeno;
        fraction1.denominator = fraction2.denominator = deno;

        return new Fraction[]{fraction1, fraction2};
    }

    public boolean isPossitiveFraction() { //kiểm tra xem có phải phân số dương không
        if (isFraction()) {
            if (this.numerator * this.denominator > 0) {
                return true;
            }
        }
        return false;
    }

    public int compareFraction(Fraction fract) { //so sánh 2 phân số, trả ra 1 nếu ps1 > ps2, 0 nếu ps1=ps2, -1 nếu ngược lại
        if (isFraction()) {
            Fraction fraction = new Fraction(this.numerator, this.denominator);
            int numerator = this.numerator;
            int denominator = this.denominator;
            fraction = fraction.subFraction(fract);

            if (fraction.isPossitiveFraction()) {
                return 1;
            } else if (fraction.numerator == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        return -2; //neu khong phai phan so
    }

}
