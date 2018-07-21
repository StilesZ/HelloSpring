package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Store store = (Store) context.getBean("stringStore");
//        ApplicationContext context=new AnnotationConfigApplicationContext(StoreConfig.class);
//        Store store=context.getBean(Store.class);
        System.out.println(store.getClass().getName());
        context.registerShutdownHook();
    }
}
