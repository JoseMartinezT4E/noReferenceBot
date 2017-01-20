package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.ControllerMap;
import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveController extends Command {

	private double speed;
	private double driveOrientation;
	
	public DriveController() {
		// here we actually need things from the Chassis subsystem so we will
		// put robot.chassis into requires
		requires(Robot.chassis);

	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	// Drive requires continous input so it will repeatedly run until we tell it
	// to stop
	protected void execute() {

		// if statement that use isHigh data to tell whether to run high or low drive speeds		
		if (Robot.chassis.isHigh) {
			speed = 1;
		} else {
			speed = 0.85;
		}
		
		// // if statement that use isReversed data to tell whether to be reversed or regular
		if (Robot.chassis.isReversed){
			driveOrientation = -1;
		}else {
			driveOrientation = 1;
		}

		// if statement that use isArcade data to tell whether to run arcade or tank drive		
		if (Robot.chassis.isArcade) {
			Robot.chassis.arcadeDrive(
					Robot.oi.leftY(ControllerMap.driveController) * speed * driveOrientation,   // multiplying the input that we are recieving from the
					Robot.oi.rightX(ControllerMap.driveController) * speed * driveOrientation); // driveController tell us whether it's going slower or backwards
		} else {
			Robot.chassis.tankDrive(
					Robot.oi.leftY(ControllerMap.driveController) * speed * driveOrientation ,
					Robot.oi.rightY(ControllerMap.driveController) * speed * driveOrientation);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.chassis.driveStop(); // stops motors
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end(); // calls on end() method and does whatever is inside there
	}
}
