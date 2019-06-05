package com.java.designpattern.builder;

public class RobotEngineer {

	private OldRobotBuilder robotBuilder;
	
	public RobotEngineer(OldRobotBuilder oldRobotBuilder) {
		this.robotBuilder = oldRobotBuilder;
	}
	
	public void buildRobot() {
		robotBuilder.buildRobotHead();
		robotBuilder.buildRobotTorso();
		robotBuilder.buildRobotArms();
		robotBuilder.buildRobotLegs();
	}
	
	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
}
