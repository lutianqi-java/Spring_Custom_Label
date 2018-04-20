package com.spring.lu.start;

import com.spring.lu.entity.Registry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        String xml = "classpath:mytest.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{xml});
        Registry registry = (Registry) context.getBean("test");
        System.err.println(registry.getAddress());
    }

}
