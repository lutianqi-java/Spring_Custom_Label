package com.spring.lu.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Registry  implements InitializingBean,
        ApplicationContextAware {
    
    public ApplicationContext application;
    


    private static final long serialVersionUID = 45672141098765L;
    
    private String protocol;
    
    private String address;
    
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.application = applicationContext;
        
    }
    
    //    public Registry() {
    //    	registryMap.put("redis", new RedisRegistry());
    //    }
    
    public void afterPropertiesSet() throws Exception {
        //		registryMap.put("redis", new RedisRegistry());
    }
    
    public String getProtocol() {
        return protocol;
    }
    
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}
