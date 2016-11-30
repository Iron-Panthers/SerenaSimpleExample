package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
    private RobotDrive drive;
    
    private Hardware hardware;
  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Drive() {
    	hardware = Robot.hardware;
    	drive = new RobotDrive(hardware.leftDrive, hardware.rightDrive);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void useArcadeDrive(Joystick stick){
    	drive.arcadeDrive(stick);
    }
    public void setLeftRightMotors(double leftMotors, double rightMotors) {
    	drive.setLeftRightMotorOutputs(leftMotors, rightMotors);
    }
    public void stopDriveMotors() {
    	setLeftRightMotors(0, 0);
    }
}

