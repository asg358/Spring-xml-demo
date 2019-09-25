package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor1;

    public Movie() {
    }

    public Movie(Actor actor1){
        this.actor1 = actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor1() {
        return actor1;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        //System.out.println(beanFactory);

    }

    @Override
    public void setBeanName(String s) {

        System.out.println(s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

       // System.out.println(applicationContext);

    }
}
