import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        student s=(student)context.getBean("student");
        System.out.println(s.getAge()+" "+s.getName());

    }
}
