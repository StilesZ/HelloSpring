import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import  org.springframework.beans.factory.InitializingBean;
import  org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
public static void main(String[] args){
    AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    hello h=(hello)context.getBean("helloWorld");


//    XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//    hello h=(hello)factory.getBean("helloWorld");
//    h.setName("dsads1");
//    h.say();

//    hello h1=(hello)context.getBean("helloWorld");
//    h1.setName("dsads");
//    h1.say();
//    context.registerShutdownHook();

    h.say();
    h.say2();

    helloIndia india=(helloIndia)context.getBean("helloIndia");
    india.say();
    india.say2();
    india.say3();
}
}
