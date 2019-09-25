package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Name of the actor "+movie.getActor1().getName());
        System.out.println("Gender is "+movie.getActor1().getGender());
        System.out.println("Age is "+ movie.getActor1().getAge());
/*
        Movie movie1=context.getBean("movieA",Movie.class);
        System.out.println(movie1.getActor1().getName());
        System.out.println(movie1.getActor2().getName());
        System.out.println(movie1.getActor3().getName());
*/
        ((AbstractApplicationContext)context).registerShutdownHook();


    }
}
