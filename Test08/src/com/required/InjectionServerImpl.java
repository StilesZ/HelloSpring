package com.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServerImpl implements InjectionServer {

    @Autowired
    protected InjectionDAO injectionDAO;

    //构造
    @Autowired
    public  InjectionServerImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }

    //设值
    @Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg){
        System.out.println( "server:"+arg);
        arg=arg+":"+this.hashCode();
        injectionDAO.save(arg);
    }
}
