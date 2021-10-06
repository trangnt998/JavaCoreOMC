package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//kết quả làm tròn với 1 chữ số thập phân
@DisplayName("Calculator Perimeter And Area of Triangle")
public class TriangleTest {

    @Test
    @DisplayName("Perimeter should equal 12")
    public void TestPerimeterTriangle_1() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(4, 0);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 12.0;
        double actual = Math.round(triangle.getPerimeterTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Perimeter should equal 3.4")
    public void TestPerimeterTriangle_2() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 0);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 3.4;
        double actual = Math.round(triangle.getPerimeterTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Perimeter should equal 0")
    public void TestPerimeterTriangle_3() { //3 điểm trùng nhau
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 0.0;
        double actual = Math.round(triangle.getPerimeterTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Perimeter should equal 0")
    public void TestPerimeterTriangle_4() {//3 điểm thẳng hàng
        Point A = new Point(0, 1);
        Point B = new Point(0, 2);
        Point C = new Point(0, 3);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 0.0;
        double actual = Math.round(triangle.getPerimeterTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Area should equal 14.5")
    public void TestAreaTriangle_1() {
        Point A = new Point(1, 2);
        Point B = new Point(-3, 1);
        Point C = new Point(2, -5);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 14.5;
        double actual = Math.round(triangle.getAreaTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Area should equal 0.5")
    public void TestAreaTriangle_2() {
        Point A = new Point(0, 0);
        Point B = new Point(-1, -1);
        Point C = new Point(-1, 0);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 0.5;
        double actual = Math.round(triangle.getAreaTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Area should equal 0")
    public void TestAreaTriangle_3() {//3 điểm trùng nhau
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 0.0;
        double actual = Math.round(triangle.getAreaTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Area should equal 0")
    public void TestAreaTriangle_4() {//3 điểm thẳng hàng
        Point A = new Point(0, 1);
        Point B = new Point(0, 2);
        Point C = new Point(0, 3);
        Triangle triangle = new Triangle(A, B, C);

        double expected = 0.0;
        double actual = Math.round(triangle.getAreaTriangle() * 10) / 10.0;

        assertEquals(expected, actual);
    }


}
