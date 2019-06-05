package com.java.designpattern.builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		OldRobotBuilder oldRobotBuilder = new OldRobotBuilder(); // can be thought of as a blueprint to build a specific type of robot
		
		RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
		robotEngineer.buildRobot();
		
		Robot robot = robotEngineer.getRobot();
		System.out.println("Robot: " + "\nRobot Head - " + robot.getRobotHead() +
				"\nRobot Arms - " + robot.getRobotArms() + 
				"\nRobot Torso - " + robot.getRobotTorso() +
				"\nRobot Legs - " + robot.getRobotLegs());
	}

}
