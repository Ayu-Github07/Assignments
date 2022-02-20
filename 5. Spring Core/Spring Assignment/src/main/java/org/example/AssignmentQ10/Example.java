package org.example.AssignmentQ10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Example implements ApplicationContextAware, BeanNameAware {
    private String place;
    Demo demo;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "Example: [" +
                "place='" + place + '\'' +
                ", demo=" + demo +
                ']';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application name: "+ applicationContext);
    }
}
