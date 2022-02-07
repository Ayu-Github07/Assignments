package org.example.AssignmentQ10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentQ10.xml");
        Example example1 = context.getBean("example1", Example.class);
        System.out.println(example1);
    }
}
