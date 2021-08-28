package oop.entities;

public class Point {
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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point genaratePoint() {
        int max = 20;
        int min = -20;
        int x = (int) Math.floor(Math.random() * (max - min) + min);
        int y = (int) Math.floor(Math.random() * (max - min) + min);
        return new Point(x, y);
    }

    public void printPoint() {
        System.out.format("(x,y) = (%d,%d)\n", this.x, this.y);
    }

    public double distance(Point p) { //tính khoảng cách 2 điểm
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public Point symmetryPointO() {//điểm đối xứng qua gốc tọa độ O
        Point point = new Point();
        point.x = -this.x;
        point.y = -this.y;
        return point;
    }

    public Point symmetryOx() {//điểm đối xứng qua truc Ox
        Point point = new Point();
        point.x = this.x;
        point.y = -this.y;
        return point;
    }

    public Point symmetryOy() {//điểm đối xứng qua truc Oy
        Point point = new Point();
        point.x = -this.x;
        point.y = this.y;
        return point;
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
