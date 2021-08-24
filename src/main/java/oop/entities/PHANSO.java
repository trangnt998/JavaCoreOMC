package oop.entities;

import static oop.entities.Utils.gCD;

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
            int gCD = gCD(this.tuSo, this.mauSo);
            phanso.tuSo = this.tuSo / gCD;
            phanso.mauSo = this.mauSo / gCD;
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
            if (Math.abs(gCD(this.tuSo, this.mauSo)) == 1) {
                return true;
            }
        }
        return false;
    }

    //Quy đồng hai phân số
    public PHANSO[] isomerizatePhanSo(PHANSO ps) {//quy đồng 2 phân số
        PHANSO phanso1 = new PHANSO();
        PHANSO phanso2 = new PHANSO();
        reducePhanSo();
        ps.reducePhanSo();

        phanso1.mauSo = phanso2.mauSo = this.mauSo * ps.mauSo;
        phanso1.tuSo = this.tuSo * ps.mauSo;
        phanso2.tuSo = ps.tuSo * this.mauSo;

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

    public void comparePhanSo(PHANSO ps) { //so sánh 2 phân số
        if (isPhanSo()) {
            PHANSO PS = new PHANSO(this.tuSo, this.mauSo);
            int ts = this.tuSo;
            int ms = this.mauSo;
            PS.subPhanSo(ps);

            if (PS.tuSo * PS.mauSo > 0) {
                System.out.format("%d/%d > %d/%d\n", ts, ms, ps.tuSo, ps.mauSo);
            } else if (PS.tuSo == 0) {
                System.out.format("%d/%d = %d/%d\n", ts, ms, ps.tuSo, ps.mauSo);
            } else {
                System.out.format("%d/%d < %d/%d\n", ts, ms, ps.tuSo, ps.mauSo);
            }
        }
    }

}
