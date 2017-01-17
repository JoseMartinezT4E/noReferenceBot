package org.usfirst.frc.team4.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// Here's where all the hardware of the robot gets mapped to the ports of the roborio
	// The roborio has many ports that tell us where power is being sent through
	// Notice that there is nothing for the RobotDrive object we've made
	
	public static int CHASSIS_LEFT_FRONT_MOTOR = 0;
	public static int CHASSIS_LEFT_BACK_MOTOR = 1;
	public static int CHASSIS_RIGHT_FRONT_MOTOR = 2;
	public static int CHASSIS_RIGHT_BACK_MOTOR = 3;
	
}
