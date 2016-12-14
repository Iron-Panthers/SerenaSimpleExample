package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	
	public MotorGroup leftDrive;
	public MotorGroup rightDrive;
	public Talon intake;
	public DigitalInput bannersensor;
	
	public Hardware(){
		
		Talon[] leftMotors = {new Talon(Constants.DRIVE_LEFT_MOTOR_1),new Talon(Constants.DRIVE_LEFT_MOTOR_2), new Talon(Constants.DRIVE_LEFT_MOTOR_3)};
		Talon[] rightMotors = {new Talon(Constants.DRIVE_RIGHT_MOTOR_1), new Talon(Constants.DRIVE_RIGHT_MOTOR_2), new Talon(Constants.DRIVE_RIGHT_MOTOR_3)};
		
				
		leftDrive = new MotorGroup(Constants.DRIVE_LEFT_INVERTED, leftMotors);
		rightDrive = new MotorGroup(Constants.DRIVE_RIGHT_INVERTED, rightMotors);
		
		intake = new Talon(Constants.INTAKE_MOTOR_PORT);
		
		bannersensor = new DigitalInput(Constants.BANNER_SENSOR_PORT);

	}
}
