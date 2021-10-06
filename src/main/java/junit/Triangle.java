package junit;

public class Triangle {
    private Point p1, p2, p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean isTriangle() { //check xem 3 cạnh có tạo thành 1 tam giác không, vì có trường hợp 3 điểm thẳng hàng hoặc trùng nhau!
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }


    public double getPerimeterTriangle() {//chu vi tam giac
        if (isTriangle()) {
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            return a + b + c;
        }
        return 0;
    }


    public double getAreaTriangle() {//dien tich tam giac
        if (isTriangle()) {
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            double p = 0.5 * getPerimeterTriangle();
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }
}
