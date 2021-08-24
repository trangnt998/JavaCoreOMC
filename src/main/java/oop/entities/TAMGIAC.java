package oop.entities;

public class TAMGIAC {
    /*
    Tam giác
    § Khai báo kiểu dữ lịêu tam giác (TAMGIAC)
    § Nhập/Xuất tam giác
    § Tính chu vi, diện tích tam giác
     */
    private int a;
    private int b;
    private int c;

    public TAMGIAC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TAMGIAC() {
    }

    public boolean isTriangle() { //check xem 3 cạnh có tạo thành 1 tam giác không
        if ((this.a + this.b > this.c) && (this.a + this.c > this.b) && (this.b + this.c > this.a)) {
            return true;
        }
        return false;
    }

    public void printTamGiac() {
        if (isTriangle()) {
            System.out.format("(a,b,c) = (%d,%d,%d)\n", this.a, this.b, this.c);
        } else {
            System.out.println("Khong phai tam giac!");
        }
    }

    public int getPerimeterTriangle() {//chu vi tam giac
        if (isTriangle()) {
            return this.a + this.b + this.c;
        }
        return 0;
    }

    public float getAreaTriangle() {//dien tich tam giac
        if (isTriangle()) {
            float p = (float) (0.5 * getPerimeterTriangle());
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }


}
