package oop.entities;

public class DONTHUC {
    /*
    § Khai báo kiểu dữ liệu đơn thức (DONTHUC)
    § Nhập/Xuất đơn thức
    § Tính tích, thương hai đơn thức
    § Tính đạo hàm cấp 1 của đơn thức
    § Tính đạo hàm cấp k của đơn thức
    § Tính giá trị đơn thức tại x = x0
     */

    //XÉT ĐƠN THỨC ĐƠN GIẢN DẠNG 1 BIẾN với hệ số nguyên
    private int coef;
    private int exp;

    public DONTHUC() {

    }

    public DONTHUC(int coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public void printDonThuc() {
        if (this.exp == 0) {
            System.out.format("%d\n", this.coef);
        } else if (this.exp == 1) {
            System.out.format("%dx\n", this.coef);
        } else if (this.coef == 0) {
            System.out.format("0\n", this.coef);
        } else {
            System.out.format("%dx^%d\n", this.coef, this.exp);
        }

    }

    public DONTHUC mulDonThuc(DONTHUC dt) { //tích 2 đơn thức
        DONTHUC donthuc = new DONTHUC();
        donthuc.coef = this.coef * dt.coef;
        donthuc.exp = this.exp + dt.exp;
        return donthuc;
    }

    public DONTHUC divDonThuc(DONTHUC dt) { //thương 2 đơn thức //vẫn để kiểu int sau chia, làm tròn xuống
        DONTHUC donthuc = new DONTHUC();
        donthuc.coef = this.coef / dt.coef;
        donthuc.exp = this.exp - dt.exp;
        return donthuc;
    }

    public DONTHUC derivativeDonThuc() { //đạo hàm cấp 1 của đơn thức
        DONTHUC donthuc = new DONTHUC();
        donthuc.coef = this.coef * this.exp;
        donthuc.exp = this.exp - 1;
        return donthuc;
    }

    public DONTHUC k_DerivativeDonThuc(int k) { //đạo hàm cấp k của đơn thức
        DONTHUC donthuc = new DONTHUC();
        while (k > 0) {
            this.coef *= this.exp;
            this.exp -= 1;
            k--;
        }
        donthuc.coef = this.coef;
        donthuc.exp = this.exp;
        return donthuc;
    }

    public int getValueDonThuc(int x0) { //Tính giá trị đơn thức tại x = x0
        return (int) (coef * Math.pow(x0, this.exp));
    }
}
