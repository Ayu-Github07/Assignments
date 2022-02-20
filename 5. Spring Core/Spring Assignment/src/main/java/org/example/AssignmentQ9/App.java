package org.example.AssignmentQ9;

import org.example.AssignmentQ8.AnnotationBeanLifeCycle;
import org.example.AssignmentQ8.InterfaceBeanLifeCycle;
import org.example.AssignmentQ8.XmlBeanLifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //This is the code segment for implementing bean lifecycle for XML.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AssignmentQ9.xml");
        org.example.AssignmentQ8.XmlBeanLifeCycle obj = (XmlBeanLifeCycle) context.getBean("XML1");

        System.out.println(obj);

        context.registerShutdownHook();
    }

}
