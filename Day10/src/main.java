import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        MyDriverManager manager= (MyDriverManager) context.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }


}
