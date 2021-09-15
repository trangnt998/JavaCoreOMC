package electric;

public abstract class Customer {
    private String ID;
    private String name;
    private String phone;
    private int customerType;
    private double electricNumberPrevPeriod;
    private double electricNumberThisPeriod;

    public Customer() {
    }

    public Customer(String ID, String name, String phone, int customerType,
                    double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.customerType = customerType;
        this.electricNumberPrevPeriod = electricNumberPrevPeriod;
        this.electricNumberThisPeriod = electricNumberThisPeriod;
    }

    public double calElectricNumber() { //tính số điện (kwh) sử dụng trong tháng
        return this.electricNumberThisPeriod - this.electricNumberPrevPeriod;
    }

    public abstract double calElectricBill(); //tính số tiền điện phải trả
}
