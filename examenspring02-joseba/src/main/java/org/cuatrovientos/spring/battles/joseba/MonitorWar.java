package org.cuatrovientos.spring.battles.joseba;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MonitorWar {
	
	@Before("execution(* org.cuatrovientos.spring.battles.joseba.Battle.engage(*))")
	public void engagingSoldier() {
		System.out.println("Soldiers fighting");
	}

	@Before("execution(* org.cuatrovientos.spring.battles.joseba.Battle.engage(*))")
	public void engagingSoldier(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().toShortString() + "Soldiers Fighting with join Point");
	}

	@AfterReturning(value = "execution(* org.cuatrovientos.spring.battles.joseba.Battle.engage(*))", returning = "soldier")
	public void engagingSoldier(JoinPoint joinPoint, Soldier soldier) {
		System.out.println(joinPoint.getThis().toString() + " Survivor: " + soldier);
	}

}
