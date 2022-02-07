package org.example.AssignmentQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentQ2.xml");

        Question1 question1 = context.getBean("question1",Question1.class);
        System.out.println("1.A program where answers is of type List<String> or String []");

        System.out.println(question1);


        System.out.println("****************************************************************************");

        Question2 question2 = context.getBean("question2",Question2.class);
        System.out.println("A program where answers is of type Set<String>");
        System.out.println(question2);

        System.out.println("****************************************************************************");

        Question3 question3 = context.getBean("question3",Question3.class);
        System.out.println("A program where answers is of type Map<Integer, String>");
        System.out.println(question3);
    }
}
