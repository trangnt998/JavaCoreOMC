package oop;

import oop.entities.Point;
import oop.entities.Monomial;
import oop.entities.Fraction;
import oop.entities.Triangle;

public class App {
    public static void main(String[] args) {
        //test PHANSO
        System.out.println("===============TEST PHAN SO:=================");
        Fraction ps1 = new Fraction(2, 4);
        Fraction ps2 = new Fraction(-1, 3);

        ps1.printFraction();
        ps2.printFraction();

        System.out.println("Phan so 1 toi gian -> " + ps1.isReduceFraction());
        System.out.println("Phan so 2 toi gian -> " + ps2.isReduceFraction());

        Fraction ps3 = ps1.reduceFraction();
        Fraction ps4 = ps2.reduceFraction();
        ps3.printFraction();
        ps4.printFraction();

        System.out.print("Tong: ");
        ps1.addFraction(ps2).printFraction();
        System.out.print("Hieu: ");
        ps1.subFraction(ps2).printFraction();
        System.out.print("Tich: ");
        ps1.mulFraction(ps2).printFraction();
        System.out.print("Thuong: ");
        ps1.divFraction(ps2).printFraction();

        System.out.println("Quy dong: ");
        Fraction[] listPs = ps1.isomerizateFraction(ps2);
        listPs[0].printFraction();
        listPs[1].printFraction();

        System.out.println("Phan so ps1 duong -> " + ps1.isPossitiveFraction());
        System.out.println(ps1.compareFraction(ps2));


        //test DONTHUC
        System.out.println("===============TEST DONTHUC:=================");
        Monomial monomial1 = new Monomial(2, 2);
        Monomial monomial2 = new Monomial(3, 5);
        monomial1.printMonomial();
        monomial2.printMonomial();

        Monomial monomial = monomial1.mulMonomial(monomial2);
        System.out.print("Tich 2 don thuc: ");
        monomial.printMonomial();

        monomial = monomial1.divMonomial(monomial2);
        System.out.print("Thuong 2 don thuc: ");
        monomial.printMonomial();

        System.out.print("Dao ham cap 1: ");
        monomial = monomial1.derivativeMonomial();
        monomial.printMonomial();


        int k = 3;
        System.out.format("Dao ham cap %d: ", k);
        monomial = monomial1.k_DerivativeMonomial(k);
        monomial.printMonomial();

        int x0 = -1;
        System.out.println("Gia tri don thuc tai x = " + x0 + " la: " + monomial1.getValueMonomial(x0));


        //test DIEM
        System.out.println("===============TEST DIEM:=================");
        Point point = new Point(1, 2);
        point.printPoint();

        Point point1 = point.symmetryPointO();
        Point point2 = point.symmetryOx();
        Point point3 = point.symmetryOy();
        point1.printPoint();
        point2.printPoint();
        point3.printPoint();

        System.out.println("Goc phan tu thu " + point.quadrant());


        //test TAMGIAC
        System.out.println("===============TEST TAMGIAC:=================");
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printTamGiac();

        System.out.println(triangle.getPerimeterTriangle());
        System.out.println(triangle.getAreaTriangle());
    }
}
