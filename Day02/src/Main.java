import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEdit te = (TextEdit) context.getBean("textEdit");
        te.spellCheck();

        JavaCollection collection=(JavaCollection)context.getBean("JavaCollection");
        collection.getAddressList();
        collection.getAddressMap();
        collection.getAddressPro();
        collection.getAddressSet();
    }
}
