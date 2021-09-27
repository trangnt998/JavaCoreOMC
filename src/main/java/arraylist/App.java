package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Xây dựng chương trình cho phép người dùng chọn các chức năng sau:
 * – Nhập vào danh sách các phân số, sau đó cho phép
 * – Xuất danh sách phân số
 * – Thêm phân số
 * – Xóa phân số tại vị trí thứ k
 * – Cập nhật phân số tại vị trí thứ k
 * – Tìm các phân số có giá trị lớn nhất
 * – Xóa tất cả các phân số
 */
public class App {

    public static Fraction[] sortFractionByAsc(Fraction[] fractions) { //sắp xếp danh sách phân số giảm dần
        for (int i = 0; i < fractions.length - 1; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].compareFraction(fractions[j]) < 0) {
                    Fraction fractTmp = fractions[i];
                    fractions[i] = fractions[j];
                    fractions[j] = fractTmp;
                }
            }
        }
        return new Fraction[]{};
    }


    public static void main(String[] args) {
        ArrayList<Fraction> fractions = new ArrayList<Fraction>();
        int command = 0;
        do {
            System.out.println("----------");
            System.out.println("1. Nhập danh sách phân số dạng a/b");
            System.out.println("2. Xuất danh sách phân số");
            System.out.println("3. Thêm 1 phân số");
            System.out.println("4. Xóa phân số thứ k");
            System.out.println("5. Cập nhật phân số thứ k");
            System.out.println("6. Tìm các phân số có giá trị lớn nhất");
            System.out.println("7. Xóa tất cả các phân số");
            System.out.println("0. Quit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("--Your command--");
            command = scanner.nextInt();


            switch (command) {

                case 1:
                    System.out.println("1. Nhập danh sách phân số dạng a/b");
                    int check;
                    do {
                        System.out.print("Tử số = ");
                        int a = scanner.nextInt();
                        System.out.print("Mẫu số = ");
                        int b = scanner.nextInt();

                        Fraction fraction = new Fraction(a, b);
                        fractions.add(fraction);
                        System.out.println("Nhấn 1 để tiếp tục nhập danh sách phân số, 0 để dừng lại!");
                        check = scanner.nextInt();
                    } while (check == 1);
                    System.out.println("End task!");
                    break;

                case 2:
                    System.out.println("2. Xuất danh sách phân số");
                    for (Fraction f : fractions) {
                        f.printFraction();
                    }
                    break;

                case 3:
                    System.out.println("3. Thêm 1 phân số");
                    System.out.print("Tử số = ");
                    int a = scanner.nextInt();
                    System.out.print("Mẫu số = ");
                    int b = scanner.nextInt();

                    Fraction fraction = new Fraction(a, b);
                    fractions.add(fraction);
                    break;

                case 4:
                    System.out.println("4. Xóa phân số thứ k");
                    System.out.print("Nhập chỉ số của phân số cần xóa, chỉ số tính từ 1: ");
                    int k = scanner.nextInt();
                    fractions.remove(k - 1);
                    break;

                case 5:
                    System.out.println("5. Cập nhật phân số thứ k");
                    System.out.print("Nhập chỉ số của phân số cần cập nhật, chỉ số tính từ 1: ");
                    k = scanner.nextInt();
                    System.out.println("Nhập phân số mới:");
                    System.out.print("Tử số = ");
                    a = scanner.nextInt();
                    System.out.print("Mẫu số = ");
                    b = scanner.nextInt();

                    fraction = new Fraction(a, b);
                    fractions.set(k - 1, fraction);
                    break;

                case 6:
                    System.out.println("6. Tìm các phân số có giá trị lớn nhất");
                    fraction = new Fraction();
                    Fraction[] arrayFraction = new Fraction[fractions.size()];
                    arrayFraction = sortFractionByAsc(arrayFraction);

                    if (arrayFraction.length == 0) {
                        System.out.println("Không có!");
                    } else if (arrayFraction.length == 1) {
                        arrayFraction[0].printFraction();
                    } else {
                        for (int i = 1; i < arrayFraction.length; i++) {
                            if (arrayFraction[0].compareFraction(arrayFraction[i]) == 1) {
                                arrayFraction[0].printFraction();
                            } else if (arrayFraction[0].compareFraction(arrayFraction[i]) == 0) {
                                arrayFraction[0].printFraction();
                                arrayFraction[i].printFraction();
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("7. Xóa tất cả các phân số");
                    fractions.removeAll(fractions);
                    break;
            }

        } while (command != 0);
    }
}
