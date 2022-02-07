package org.example.AssignmentQ1;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerContact;
    private Address address;

    public Customer() {
        super();
    }

    public Customer(int customerId, String customerName, long customerContact, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: [" +
                "customerId=" + customerId + "\n" +
                ", customerName='" + customerName + "\n" +
                ", customerContact=" + customerContact + "\n" +
                ", address=" + address +
                ']';
    }
}
