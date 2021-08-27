package oop.entities;

public class Monomial {
    /*
    § Khai báo kiểu dữ liệu đơn thức (DONTHUC)
    § Nhập/Xuất đơn thức
    § Tính tích, thương hai đơn thức
    § Tính đạo hàm cấp 1 của đơn thức
    § Tính đạo hàm cấp k của đơn thức
    § Tính giá trị đơn thức tại x = x0
     */

    //XÉT ĐƠN THỨC ĐƠN GIẢN DẠNG 1 BIẾN với hệ số nguyên
    private float coef;
    private int exp;

    public Monomial() {
    }

    public Monomial(float coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }


    public void printMonomial() {
        if (coef % 1 == 0) {
            if (this.exp == 0) {
                System.out.format("%.0f\n", this.coef);
            } else if (this.exp == 1) {
                System.out.format("%.0fx\n", this.coef);
            } else if (this.coef == 0) {
                System.out.format("0\n");
            } else {
                System.out.format("%.0fx^%d\n", this.coef, this.exp);
            }
        } else {
            if (this.exp == 0) {
                System.out.format("%.1f\n", this.coef);
            } else if (this.exp == 1) {
                System.out.format("%.1fx\n", this.coef);
            } else {
                System.out.format("%.1fx^%d\n", this.coef, this.exp);
            }
        }
    }

    public Monomial mulMonomial(Monomial mono) { //tích 2 đơn thức
        Monomial monomial = new Monomial();
        monomial.coef = this.coef * mono.coef;
        monomial.exp = this.exp + mono.exp;
        return monomial;
    }

    public Monomial divMonomial(Monomial mono) { //thương 2 đơn thức , lấy 1 số sau dấu phẩy
        Monomial monomial = new Monomial();
        monomial.coef = this.coef / mono.coef;
        monomial.exp = this.exp - mono.exp;
        return monomial;
    }

    public Monomial derivativeMonomial() { //đạo hàm cấp 1 của đơn thức
        Monomial monomial = new Monomial();
        monomial.coef = this.coef * this.exp;
        monomial.exp = this.exp - 1;
        return monomial;
    }

    public Monomial k_DerivativeMonomial(int k) { //đạo hàm cấp k của đơn thức
        Monomial monomial = new Monomial();
        monomial.coef = this.coef;
        monomial.exp = this.exp;
        if (k > this.exp) {
            monomial.coef = monomial.exp = 0;
        } else {
            while (k > 0) {
                monomial.coef *= monomial.exp;
                monomial.exp -= 1;
                k--;
            }
        }
        return monomial;
    }

    public int getValueMonomial(int x0) { //Tính giá trị đơn thức tại x = x0
        return (int) (coef * Math.pow(x0, this.exp));
    }
}
