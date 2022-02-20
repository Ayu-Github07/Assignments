package org.example.AssignmentQ8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBeanLifeCycle {
    int price;

    public AnnotationBeanLifeCycle() {
        super();
    }

    @Override
    public String toString() {
        return "AnnotationBeanLifeCycle Price: {" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @PostConstruct
    public void init(){
        System.out.println("Calling init using Annotation");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Calling destroy from Annotation");
    }
}
