import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanName implements BeanNameAware,ApplicationContextAware {

    private String Beanname;

    @Override
    public void setBeanName(String s) {
        this.Beanname =s;
        System.out.println("application:"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application:"+applicationContext.getBean(this.Beanname).hashCode());
    }
}
