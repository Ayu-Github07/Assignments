package org.example.AssignmentQ9;

public class XmlBeanLifeCycle {
    private double price;

    public XmlBeanLifeCycle() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting the value of data members");
        this.price = price;
    }

    public void init(){
        System.out.println("Calling the initialization method of bean");
    }
    public void destroy(){
        System.out.println("Calling the destroy method of bean");
    }
    @Override
    public String toString() {
        return "ORDER PRICE: {" +
                "price=" + price +
                '}';
    }
}
