package com.springJDBC.implementinterface;

public class Customer {
    private String customerName;
    private String customerAddress;
    private int customerAge;

    public Customer(String customerName, String customerAddress, int customerAge) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
    }

    public Customer() {
        super();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    @Override
    public String toString() {
        return
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerAge=" + customerAge ;
    }
}
