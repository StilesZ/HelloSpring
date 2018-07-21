package com.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        InjectionServer service= (InjectionServerImpl) context.getBean("injectionServerImpl");
        service.save("test");
    }
}
