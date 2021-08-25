package oop;

import oop.entities.DIEM;
import oop.entities.DONTHUC;
import oop.entities.PHANSO;
import oop.entities.TAMGIAC;

public class App {
    public static void main(String[] args) {
        //test PHANSO
        System.out.println("===============TEST PHAN SO:=================");
        PHANSO ps1 = new PHANSO(2, 4);
        PHANSO ps2 = new PHANSO(-1, 3);

        ps1.printPhanSo();
        ps2.printPhanSo();

        System.out.println("Phan so 1 toi gian -> " + ps1.isReducePhanSo());
        System.out.println("Phan so 2 toi gian -> " + ps2.isReducePhanSo());

        PHANSO ps3 = ps1.reducePhanSo();
        PHANSO ps4 = ps2.reducePhanSo();
        ps3.printPhanSo();
        ps4.printPhanSo();

        System.out.print("Tong: ");
        ps1.addPhanSo(ps2).printPhanSo();
        System.out.print("Hieu: ");
        ps1.subPhanSo(ps2).printPhanSo();
        System.out.print("Tich: ");
        ps1.mulPhanSo(ps2).printPhanSo();
        System.out.print("Thuong: ");
        ps1.divPhanSo(ps2).printPhanSo();

        System.out.println("Quy dong: ");
        PHANSO[] listPs = ps1.isomerizatePhanSo(ps2);
        listPs[0].printPhanSo();
        listPs[1].printPhanSo();

        System.out.println("Phan so ps1 duong -> " + ps1.isPossitivePhanSo());
        System.out.println(ps1.comparePhanSo(ps2));


        //test DONTHUC
        System.out.println("===============TEST DONTHUC:=================");
        DONTHUC donthuc1 = new DONTHUC(2, 2);
        DONTHUC donthuc2 = new DONTHUC(1, 2);
        donthuc1.printDonThuc();
        donthuc2.printDonThuc();

        DONTHUC donthuc = donthuc1.mulDonThuc(donthuc2);
        System.out.print("Tich 2 don thuc: ");
        donthuc.printDonThuc();

        donthuc = donthuc1.divDonThuc(donthuc2);
        System.out.print("Thuong 2 don thuc: ");
        donthuc.printDonThuc();

        System.out.print("Dao ham cap 1: ");
        donthuc = donthuc1.derivativeDonThuc();
        donthuc.printDonThuc();


        int k = 3;
        System.out.format("Dao ham cap %d: ", k);
        donthuc = donthuc1.k_DerivativeDonThuc(k);
        donthuc.printDonThuc();

        int x0 = -1;
        System.out.println("Gia tri don thuc tai x = " + x0 + " la: " + donthuc1.getValueDonThuc(x0));


        //test DIEM
        System.out.println("===============TEST DIEM:=================");
        DIEM diem = new DIEM(1, 2);
        diem.printDiem();

        DIEM diem1 = diem.symmetryDiemO();
        DIEM diem2 = diem.symmetryOx();
        DIEM diem3 = diem.symmetryOy();
        diem1.printDiem();
        diem2.printDiem();
        diem3.printDiem();

        System.out.println("Goc phan tu thu " + diem.quadrant());


        //test TAMGIAC
        System.out.println("===============TEST TAMGIAC:=================");
        TAMGIAC tamgiac = new TAMGIAC(3, 4, 5);
        tamgiac.printTamGiac();

        System.out.println(tamgiac.getPerimeterTriangle());
        System.out.println(tamgiac.getAreaTriangle());
    }
}
