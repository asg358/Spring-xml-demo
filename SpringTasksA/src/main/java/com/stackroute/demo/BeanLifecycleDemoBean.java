package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean will get destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean will get created");
    }

    public void customInit(){
        System.out.println("Init method called");
    }

    public void customDestroy(){
        System.out.println("Destroy method called");
    }

}
