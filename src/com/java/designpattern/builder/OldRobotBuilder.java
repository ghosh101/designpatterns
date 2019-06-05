package com.java.designpattern.builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot; 
	
	OldRobotBuilder(){
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");

	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Metal Torso");

	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");

	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Rollerskate Legs");

	}
	
	public Robot getRobot() {
		return this.robot;
	}

}
