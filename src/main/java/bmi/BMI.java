package bmi;

public class BMI {
    /*
     *tính chỉ số BMI của cơ thể
     * áp dụng cho người >= 18 tuổi
     * cân nặng: kg
     * chiều cao: m
     */

    private int age;
    private double weight;
    private double height;

    public BMI() {
    }

    public BMI(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        double bmi = -1;
        if (this.age >= 18 && this.weight > 0 && this.height > 0) {
            bmi = this.weight / (this.height * this.height);
        }
        return bmi;
    }

}
