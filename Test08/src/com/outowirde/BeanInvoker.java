package com.outowirde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanInvoker {

    @Autowired
    private List<beanInterface> list;

    public void say(){
        if(null!=list){
            for (beanInterface bean : list)
            System.out.println(bean.getClass().getName());
        }else {
            System.out.println("null");
        }
    }
}
