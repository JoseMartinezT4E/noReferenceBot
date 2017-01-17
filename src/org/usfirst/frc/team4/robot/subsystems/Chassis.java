package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.DriveController;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {

	// right now i am creating VictorSP objects that will be able to be used
	// later on in the actual code
	// of the Chassis, as well as creating a RobotDrive objects
	// we only create these here since programmers might not know about certain objects so 
	// it is like an introduction to what will actually be used and set in places like the Constructor
	// typically we only give values to general java objects (i.e. doubles booleans) since it's common knowledge

	private VictorSP leftFwdDriveMotor, leftBwdDriveMotor, rightFwdDriveMotor, rightBwdDriveMotor;
	private RobotDrive drive;

	// here are general objects that we can control throughout our entire project since it is public
	// the above projects however can only be controlled in this class since it is private
	
	public boolean isArcade = true;
	public boolean isHigh = true; // 420 blaze it dood
	public boolean isReversed = true;
		
	public Chassis() {

		// Here the objects created at the start of the code will be
		// instantiated and given values
		// from the RobotMap so they can actually be used for the commands and
		// subsystems

		leftFwdDriveMotor = new VictorSP(RobotMap.CHASSIS_LEFT_FRONT_MOTOR);
		leftBwdDriveMotor = new VictorSP(RobotMap.CHASSIS_LEFT_BACK_MOTOR);
		rightFwdDriveMotor = new VictorSP(RobotMap.CHASSIS_RIGHT_FRONT_MOTOR);
		rightBwdDriveMotor = new VictorSP(RobotMap.CHASSIS_RIGHT_BACK_MOTOR);

		drive = new RobotDrive(leftFwdDriveMotor, leftBwdDriveMotor, rightFwdDriveMotor, rightBwdDriveMotor);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DriveController());
	}

	// this is code for our tankDrive method which uses two variables:
	// one variable that controls the left side of the drive and one for the right
	// this is why we make two variables with those names so we can tell which is which
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right); // here the two variables from the method
										// are being placed into the actual
										// tankDrive method so they can be
										// controlled when we call them from a
										// command
	}

	// this is code for our tankDrive method which uses two variables:
	// one variable that controls the forward and backwards part of the drive 
	// and one for the part that controls the turning
	// this is why we make two variables with those names so we can tell which is which	
	public void arcadeDrive(double move, double rotate) {
		drive.arcadeDrive(move, rotate); // here the two variables from the
											// method are being placed into the
											// actual arcadeDrive method so they
											// can be controlled when we call
											// them from a command
	}
	
	// here we use the stopMotor method class from the RobotDrive object we've made to 
	// stop the motors. we COULD just set both our tankDrive and arcadeDrive methods to (0,0)
	// to say that no power would be going to the robot, but this way is simpler
	// even if only reduces a single line code
	public void driveStop(){
		drive.stopMotor();
	}

}
