package bmi;

import java.util.Scanner;

public class App {
    private static boolean isInteger(String x) { //check số kiểu int
        if (x == null)
            return false;
        try {
            int a = Integer.parseInt(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isDouble(String x) { //check số kiểu double
        if (x == null)
            return false;
        try {
            double a = Double.parseDouble(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        double weight, height;
        // dinh dang tuoi
        try {
            System.out.print("Tuổi: ");
            String age1 = sc.nextLine();

            if (isInteger(age1)) {
                age = Integer.parseInt(age1);
            } else {
                throw new NumberFormatException("Tuổi nhập vào không đúng định dạng");
            }
            if (age < 0) {
                throw new BMICheckingException("Tuổi không hợp lệ!");
            }
            if (age < 18) {
                throw new BMICheckingException("Tuổi không bé hơn 18!");
            }
        } catch (Exception ex1) {
            System.out.println(ex1.getMessage());
            return;
        }

        // dinh dang can nang
        try {
            System.out.print("Cân nặng: ");
            String weight1 = sc.nextLine();

            if (isDouble(weight1)) {
                weight = Double.parseDouble(weight1);
            } else {
                throw new NumberFormatException("Cân nặng nhập vào không đúng định dạng");
            }
            if (weight <= 0) {
                throw new BMICheckingException("Cân nặng không hợp lệ!");
            }
        } catch (Exception ex2) {
            System.out.println(ex2.getMessage());
            return;
        }

        // dinh dang chieu cao
        try {
            System.out.print("Chiều cao: ");
            String height1 = sc.nextLine();
            if (isDouble(height1)) {
                height = Double.parseDouble(height1);
            } else {
                throw new NumberFormatException("Chiều cao nhập vào không đúng định dạng");
            }
            if (height <= 0) {
                throw new BMICheckingException("Chiều cao không hợp lệ!");
            }
        } catch (Exception ex3) {
            System.out.println(ex3.getMessage());
            return;
        }

        BMI bmi = new BMI(age, weight, height);
        System.out.println("Chỉ số BMI của bạn: " + bmi.calculateBMI());

    }
}
