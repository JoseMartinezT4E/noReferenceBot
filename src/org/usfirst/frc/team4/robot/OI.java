package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.commands.ToggleDriveDirection;
import org.usfirst.frc.team4.robot.commands.ToggleDriveMode;
import org.usfirst.frc.team4.robot.commands.ToggleDriveSpeed;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public OI(){
		ControllerMap.driveA.toggleWhenPressed(new ToggleDriveSpeed());
		ControllerMap.driveB.toggleWhenPressed(new ToggleDriveMode());
		ControllerMap.driveX.toggleWhenPressed(new ToggleDriveDirection());
	}
	
	
	
	public double leftY(Joystick controller){
		return controller.getRawAxis(ControllerMap.AXIS_LEFT_Y);
	}
	
	public double rightX(Joystick controller){
		return controller.getRawAxis(ControllerMap.AXIS_RIGHT_X);
	}
	
	public double rightY(Joystick controller){
		return controller.getRawAxis(ControllerMap.AXIS_RIGHT_Y);
	}
	
}
