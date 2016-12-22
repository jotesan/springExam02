package org.cuatrovientos.spring.battles.joseba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Battle battle = (Battle) context.getBean("battle");
		
		battle.makeWar();
		System.out.println(battle.toString());
	}
}
