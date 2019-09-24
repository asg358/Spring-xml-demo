package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Name of the actor "+movie.getActor().getName());
        System.out.println("Gender is "+movie.getActor().getGender());
        System.out.println("Age is "+ movie.getActor().getAge());

        Movie movieA=context.getBean("movie",Movie.class);
        System.out.println(movieA==movie);

        Movie movieB=context.getBean("movieB",Movie.class);
        Movie movieC=context.getBean("movieB",Movie.class);
        System.out.println(movieC==movieB);
    }
}
