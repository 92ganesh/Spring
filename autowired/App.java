package com.ganesh.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
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
    	
    	Vehicle ob =  (Vehicle)context.getBean("car");
    	ob.drive();
    	
        System.out.println( "End" );
    }
}

interface Vehicle{
	void drive();
}

@Component
class Car implements Vehicle{
	@Autowired
	private Tyre ob;
	
	public Tyre getOb() {
		return ob;
	}


	public void setOb(Tyre ob) {
		this.ob = ob;
	}


	public void drive() {
		System.out.println("Cycle running and "+ob);
	}	
}