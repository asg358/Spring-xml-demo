package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Movie() {
    }

    public Movie(Actor actor1, Actor actor2, Actor actor3){
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    public Actor getActor1() {
        return actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public Actor getActor3() {
        return actor3;
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
