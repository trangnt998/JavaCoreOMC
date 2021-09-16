package electric;

public abstract class Customer {
    private String ID;
    private String name;
    private String phone;
    private double customerType;

    public Customer() {
    }

    public Customer(String ID, String name, String phone, double customerType) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.customerType = customerType;
    }

    public String toString() { //xuất thông tin khách hàng
        return "\nID: " + this.ID +
                "\nTên khách hàng: " + this.name +
                "\nSĐT : " + this.phone;
    }


    public abstract double calElectricBill(); //tính số tiền điện phải trả
}
