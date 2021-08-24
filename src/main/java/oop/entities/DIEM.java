package oop.entities;

public class DIEM {
    /*
    Điểm trong mặt phẳng Oxy
        § Khai báo kiểu dữ liệu điểm (DIEM)
        § Nhập/Xuất tọa độ điểm
        § Tính khoảng cách giữa hai điểm
        § Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
        § Kiểm tra điểm thuộc phần tư nào?
     */

    private int x;
    private int y;

    public DIEM(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public DIEM() {
    }

    public void printDiem() {
        System.out.format("(x,y) = (%d,%d)\n", this.x, this.y);
    }

    public double distance(DIEM d) { //tính khoảng cách 2 điểm
        return Math.sqrt((this.x - d.x) * (this.x - d.x) + (this.y - d.y) * (this.y - d.y));
    }

    public DIEM symmetryDiemO() {//điểm đối xứng qua gốc tọa độ O
        DIEM diem = new DIEM();
        diem.x = -this.x;
        diem.y = -this.y;
        return diem;
    }

    public DIEM symmetryOx() {//điểm đối xứng qua truc Ox
        DIEM diem = new DIEM();
        diem.x = this.x;
        diem.y = -this.y;
        return diem;
    }


    public DIEM symmetryOy() {//điểm đối xứng qua truc Oy
        DIEM diem = new DIEM();
        diem.x = -this.x;
        diem.y = this.y;
        return diem;
    }

    public int quadrant() {// đưa ra góc phần tư của điểm, nếu điểm thuộc trục thì trả về 0
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

}
