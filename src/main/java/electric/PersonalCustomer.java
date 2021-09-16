package electric;

public abstract class PersonalCustomer extends Customer {
    private double electricNumberPrevPeriod;
    private double electricNumberThisPeriod;

    public PersonalCustomer() {
    }

    public PersonalCustomer(String ID, String name, String phone, double customerType,
                            double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        super(ID, name, phone, customerType);
        this.electricNumberPrevPeriod = electricNumberPrevPeriod;
        this.electricNumberThisPeriod = electricNumberThisPeriod;
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nSố điện kì trước: " + this.electricNumberPrevPeriod +
                "\nSố điện kì này: " + this.electricNumberThisPeriod +
                "\nSố điện sử dụng kì này: " + calElectricNumber();
    }

    public double calElectricNumber() { //tính số điện (kwh) sử dụng trong tháng
        return this.electricNumberThisPeriod - this.electricNumberPrevPeriod;
    }

    public abstract double calElectricBill(); //tính số tiền điện phải trả
}

