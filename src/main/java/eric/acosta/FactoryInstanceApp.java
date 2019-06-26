package eric.acosta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eric.acosta.controller.IController;

public class FactoryInstanceApp {
	public static void main(String args[]) {		
		System.out.println("Inicia FactoryAPP");
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		IController control = (IController)applicationContext.getBean("controller");
		control.execute();
	}
	

}
