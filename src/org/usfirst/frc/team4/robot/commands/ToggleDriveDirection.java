package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleDriveDirection extends Command {

    public ToggleDriveDirection() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	// here we could call on chassis but it's not necessary since we are using a public object
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.chassis.isReversed = !Robot.chassis.isReversed; // makes isReversed turn to the opposite 
    														  // state (true or false) from before
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// nothing needs to be continously outputted so we gucci for this 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true; // only runs once so it will return true
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
