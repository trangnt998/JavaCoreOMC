package options.JavaBinFileIO2;

import java.time.LocalDate;

public class Order {
    private LocalDate date;
    private String customer;
    private double total;

    public Order() {

    }

    public Order(LocalDate date, String name, double total) {
        this.date = date;
        this.customer = name;
        this.total = total;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", customer='" + customer + '\'' +
                ", total=" + total +
                '}';
    }
}
