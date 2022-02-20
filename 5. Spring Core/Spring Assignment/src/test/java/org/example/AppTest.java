package org.example;

import static org.junit.Assert.assertTrue;

import org.example.AssignmentQ1.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    private Customer customer1;

    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentQ1.xml");
        customer1 = context.getBean("customer1",Customer.class);
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertEquals(customer1.toString(),"Customer: [customerId=12\n" +
                ", customerName='Ayush Agrawal\n" +
                ", customerContact=8770835055\n" +
                ", address=Address: [street='M.P. Nagar', city='Korba', state='Chhattisgarh', zip=495677, country='India']]");
    }
}
