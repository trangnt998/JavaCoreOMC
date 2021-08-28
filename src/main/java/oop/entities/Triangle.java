
package oop.entities;

public class Triangle {
    /*
    Tam giác
    § Khai báo kiểu dữ lịêu tam giác (TAMGIAC)
    § Nhập/Xuất tam giác
    § Tính chu vi, diện tích tam giác
     */

    private Point p1, p2, p3;

    public Triangle() {
        this.p1 = Point.genaratePoint();
        this.p2 = Point.genaratePoint();
        this.p3 = Point.genaratePoint();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    public boolean isTriangle() { //check xem 3 cạnh có tạo thành 1 tam giác không, vì có trường hợp random điểm ra 3 điểm thẳng hàng hoặc trùng nhau!
        float a = (float) p1.distance(p2);
        float b = (float) p2.distance(p3);
        float c = (float) p3.distance(p1);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }

    public void printTamGiac() {
        if (isTriangle()) {
            System.out.println("Toa do 3 dinh tam giác: ");
            System.out.format("(x1,y1) = (%d,%d)\n", p1.getX(), p1.getY());
            System.out.format("(x2,y2) = (%d,%d)\n", p2.getX(), p2.getY());
            System.out.format("(x3,y3) = (%d,%d)\n", p3.getX(), p3.getY());
        } else {
            System.out.println("Khong phai tam giac!");
        }
    }

    public float getPerimeterTriangle() {//chu vi tam giac
        if (isTriangle()) {
            float a = (float) p1.distance(p2);
            float b = (float) p2.distance(p3);
            float c = (float) p3.distance(p1);
            return a + b + c;
        }
        return 0;
    }

    public float getAreaTriangle() {//dien tich tam giac
        if (isTriangle()) {
            float a = (float) p1.distance(p2);
            float b = (float) p2.distance(p3);
            float c = (float) p3.distance(p1);
            float p = (float) (0.5 * getPerimeterTriangle());
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }

}

