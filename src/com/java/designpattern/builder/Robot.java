package com.java.designpattern.builder;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public String getRobotHead() {
		return robotHead;
	}
	
	@Override
	public void setRobotHead(String head) {
		this.robotHead = head;
	}

	public String getRobotTorso() {
		return robotTorso;
	}
	
	@Override
	public void setRobotTorso(String torso) {
		this.robotTorso = torso;
	}

	public String getRobotArms() {
		return robotArms;
	}
	
	@Override
	public void setRobotArms(String arms) {
		this.robotArms = arms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}
	
	@Override
	public void setRobotLegs(String legs) {
		this.robotLegs = legs;
	}

}
