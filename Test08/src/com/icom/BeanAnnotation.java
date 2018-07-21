package com.icom;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("bean")

//@Scope("prototype")
@Scope
public class BeanAnnotation {

    public void say(String arg){
        System.out.println("annotation:"+arg);
    }

    public void HashCode(){
        System.out.println("HashCode:"+this.hashCode());
    }
}
