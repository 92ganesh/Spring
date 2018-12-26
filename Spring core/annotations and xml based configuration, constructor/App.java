package com.ganesh.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle ob =  (Vehicle)context.getBean("bike");
    	ob.drive();
    	
    	Tyre ob2 = (Tyre)context.getBean("tyre");
    	System.out.println(ob2);
    	
        System.out.println( "End" );
    }
}

interface Vehicle{
	void drive();
}

@Component
class Car implements Vehicle{
	public void drive() {
		System.out.println("Car running");
	}	
}

@Component
class Bike implements Vehicle{
	public void drive() {
		System.out.println("Bike running");
	}
}