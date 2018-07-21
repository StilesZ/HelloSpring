import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //sout
    public void save(){
        System.out.println();
    }

    //psvm
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        InjectionServer server= (InjectionServer) context.getBean("injectionServer");
        server.save("injection");
    }
}
