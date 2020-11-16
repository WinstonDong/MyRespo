package dl.cn.test;

import cn.dl.service.UserService;
import cn.dl.spring5.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getBauthor());
        System.out.println(book.getBname());
    }

    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders.getOaddress());
        System.out.println(orders.getOname());
    }

    @Test
    public void testOuterBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = context.getBean("student", Student.class);
        System.out.println(stu.toString());
    }

    @Test
    public void testMybean() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dept dept = context.getBean("mybean", Dept.class);
        System.out.println(dept);
    }

    @Test
    public void testSingleTon() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dept dept1 = context.getBean("dept", Dept.class);
        System.out.println(dept1);
        Dept dept2 = context.getBean("dept", Dept.class);
        System.out.println(dept2);
    }

    @Test
    public void testExecutionOrder() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dept dept = context.getBean("dept", Dept.class);
        System.out.println("老子能用了 " + dept);
        context.close();
    }

    @Test
    public void testUserService() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService us = context.getBean("userService", UserService.class);
        us.add();
        System.out.println(us.getName());
    }

}
