package com.autowride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String,BeanInterface> map;

    public void say(){
        if(null!=list){
            for (BeanInterface bean : list)
                System.out.println(bean.getClass().getName());
        }else {
            System.out.println("List<BeanInterface> null");
        }

        if(null!=map && map.size()!=0){
            for (Map.Entry<String,BeanInterface> entry : map.entrySet())
                System.out.println(entry.getKey()+":"+entry.getValue().getClass().getName());
        }else {
            System.out.println("Map<String,BeanInterface> null");
        }
    }
}
