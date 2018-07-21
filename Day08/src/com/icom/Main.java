package com.icom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanAnnotation annotation= (BeanAnnotation) context.getBean("bean");
        annotation.say("text");
    }
}
