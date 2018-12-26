/** Whats new here
 *  @Primary
 *  @Qualifier("mediatek")
 *  using bean without code commented in AppConfig.java
 */

package com.ganesh.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
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

@Component
class Samsung{
	@Autowired
	@Qualifier("mediatek")
	MobileProcessor cpu;

	public void config() {
		System.out.println("samsung S8");
		cpu.processor();
	}
}

interface  MobileProcessor{
	void processor();
}

@Component
@Primary
class Snapdragon implements MobileProcessor{
	public void processor() {
		System.out.println("Worlds best processor Snapdragon");
	}
}

@Component
class Mediatek implements MobileProcessor{
	public void processor() {
		System.out.println("Worlds 2nd best processor Mediatek");
	}
}









