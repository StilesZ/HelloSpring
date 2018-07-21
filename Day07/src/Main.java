import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        MoocResource resource= (MoocResource) context.getBean("resource");
        try {
            resource.resource();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
