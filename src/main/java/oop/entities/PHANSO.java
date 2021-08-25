package oop.entities;

import static oop.entities.Utils.GCD;

public class PHANSO {
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

    private int tuSo;
    private int mauSo;


    public PHANSO(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PHANSO() {

    }

    public boolean isPhanSo() { //kiểm tra phân số có tồn tại không (mẫu khác 0)
        if (this.mauSo == 0) {
            System.out.println("Khong ton tai!");
            return false;
        }
        return true;
    }

    public void printPhanSo() {
        if (isPhanSo()) {
            if (this.tuSo == this.mauSo) {
                System.out.println(1);
            } else if (this.tuSo == 0) {
                System.out.println(0);
            } else {
                System.out.format("%d/%d\n", this.tuSo, this.mauSo);
            }
        }
    }


    public PHANSO reducePhanSo() { //rút gọn phân số
        PHANSO phanso = new PHANSO();
        if (isPhanSo()) {
            int GCD = GCD(this.tuSo, this.mauSo);
            phanso.tuSo = this.tuSo / GCD;
            phanso.mauSo = this.mauSo / GCD;
        }
        return phanso;
    }

    public PHANSO addPhanSo(PHANSO ps) { //cộng 2 phân số
        PHANSO phanso = new PHANSO();
        if (isPhanSo()) {
            phanso.tuSo = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
            phanso.mauSo = this.mauSo * ps.mauSo;
        }
        return phanso.reducePhanSo();
    }

    public PHANSO subPhanSo(PHANSO ps) { //trừ 2 phân số
        PHANSO phanso = new PHANSO();
        if (isPhanSo()) {
            phanso.tuSo = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
            phanso.mauSo = this.mauSo * ps.mauSo;
        }
        return phanso.reducePhanSo();
    }

    public PHANSO mulPhanSo(PHANSO ps) { //tích 2 phân số
        PHANSO phanso = new PHANSO();
        if (isPhanSo()) {
            phanso.tuSo = this.tuSo * ps.tuSo;
            phanso.mauSo = this.mauSo * ps.mauSo;
        }
        return phanso.reducePhanSo();
    }

    public PHANSO divPhanSo(PHANSO ps) { //thương 2 phân số
        PHANSO phanso = new PHANSO();
        if (isPhanSo()) {
            phanso.tuSo = this.tuSo * ps.mauSo;
            phanso.mauSo = this.mauSo * ps.tuSo;
        }
        return phanso.reducePhanSo();
    }

    public boolean isReducePhanSo() { //kiểm tra xem có phải phân số tối giản không
        if (isPhanSo()) {
            if (Math.abs(GCD(this.tuSo, this.mauSo)) == 1) {
                return true;
            }
        }
        return false;
    }

    //Quy đồng hai phân số
    public PHANSO[] isomerizatePhanSo(PHANSO ps) {//quy đồng 2 phân số
        PHANSO phanso1 = new PHANSO();
        PHANSO phanso2 = new PHANSO();
        phanso1.tuSo = this.tuSo;
        phanso1.mauSo = this.mauSo;
        phanso1 = phanso1.reducePhanSo();
        phanso2 = ps.reducePhanSo();

        int GCDms = GCD(phanso1.mauSo, phanso2.mauSo);
        int ms = phanso1.mauSo * phanso2.mauSo / GCDms;
        phanso1.tuSo = phanso1.tuSo * phanso2.mauSo/GCDms;
        phanso2.tuSo = phanso2.tuSo * phanso1.mauSo/GCDms;
        phanso1.mauSo = phanso2.mauSo = ms;
        System.out.println("tu so 1 " + phanso1.tuSo);
        return new PHANSO[]{phanso1, phanso2};
    }

    public boolean isPossitivePhanSo() { //kiểm tra xem có phải phân số dương không
        if (isPhanSo()) {
            if (this.tuSo * this.mauSo > 0) {
                return true;
            }
        }
        return false;
    }

    public int comparePhanSo(PHANSO ps) { //so sánh 2 phân số, trả ra 1 nếu ps1 > ps2, 0 nếu ps1=ps2, -1 nếu ngược lại
        if (isPhanSo()) {
            PHANSO PS = new PHANSO(this.tuSo, this.mauSo);
            int ts = this.tuSo;
            int ms = this.mauSo;
            PS = PS.subPhanSo(ps);

            if (PS.isPossitivePhanSo()) {
                return 1;
            } else if (PS.tuSo == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        return -2; //neu khong phai phan so
    }

}
