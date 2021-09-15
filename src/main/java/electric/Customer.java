package electric;

public abstract class Customer {
    private String ID;
    private String name;
    private String phone;
    private double customerType;
    private double electricNumberPrevPeriod;
    private double electricNumberThisPeriod;

    public Customer() {
    }

    public Customer(String ID, String name, String phone, double customerType,
                    double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.customerType = customerType;
        this.electricNumberPrevPeriod = electricNumberPrevPeriod;
        this.electricNumberThisPeriod = electricNumberThisPeriod;
    }

    public String toString() { //xuất thông tin khách hàng
        return "\nID: " + this.ID +
                "\nTên khách hàng: " + this.name +
                "\nSĐT : " + this.phone +
                "\nSố điện kì trước: " + this.electricNumberPrevPeriod +
                "\nSố điện kì này: " + this.electricNumberThisPeriod +
                "\nSố điện sử dụng kì này: " + (this.electricNumberThisPeriod - this.electricNumberPrevPeriod);
    }

    public double calElectricNumber() { //tính số điện (kwh) sử dụng trong tháng
        return this.electricNumberThisPeriod - this.electricNumberPrevPeriod;
    }

    public abstract double calElectricBill(); //tính số tiền điện phải trả
}
