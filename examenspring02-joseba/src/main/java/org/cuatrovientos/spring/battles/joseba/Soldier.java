package org.cuatrovientos.spring.battles.joseba;

public class Soldier {
	private String name;
	private Integer firePower;

	public Soldier() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFirePower() {
		return firePower;
	}

	public void setFirePower(Integer firePower) {
		this.firePower = firePower;
	}

	@Override
	public String toString() {
		return "Soldier [name=" + name + ", firePower=" + firePower + "]";
	}
}
