package com.example.customerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private int custId;
    private String custName;
    private String custAddress;
    private int pid;

    public Customer() {
        super();
    }

    public Customer(int custId, String custName, String custAddress, int pid) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.pid = pid;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Customer [custAddress=" + custAddress + ", custId=" + custId + ", custName=" + custName + ", pid=" + pid
                + "]";
    }

}
