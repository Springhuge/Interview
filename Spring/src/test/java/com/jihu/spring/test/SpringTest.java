package com.jihu.spring.test;

import com.jihu.spring.beans.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:beans.xml")
public class SpringTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void testBook(){
        Book book = (Book) ioc.getBean("book");
        Book book2 = (Book) ioc.getBean("book");
        System.out.println(book == book2);
    }
}
