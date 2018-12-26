package com.ganesh.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class App 
{
    public static void main( String[] args )
    {	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung model = factory.getBean(Samsung.class);
    	model.config();
    	 
    }
}


class Samsung{
	@Autowired
	MobileProcessor cpu;

	public void config() {
		System.out.println("samsung S8");
		cpu.processor();
	}
}

interface  MobileProcessor{
	void processor();
}

class Snapdragon implements MobileProcessor{
	public void processor() {
		System.out.println("Worlds best processor");
	}
}









