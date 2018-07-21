package com.required;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

    public void save(String arg){
        System.out.println("sad:"+arg);
    }
}
