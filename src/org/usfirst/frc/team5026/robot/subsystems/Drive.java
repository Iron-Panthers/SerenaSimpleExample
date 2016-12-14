package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.OI;
import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.triggers.ArcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
    private RobotDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Drive() {
    	drive = new RobotDrive(Robot.hardware.leftDrive, Robot.hardware.rightDrive);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDrive());
    }
    public void useArcadeDrive(Joystick stick) {
    	//drive.arcadeDrive(stick);
    	drive.arcadeDrive(OI.stick.getY(), OI.stick.getX());
    	
    }
    public void setLeftRightMotors(double leftMotors, double rightMotors) {
    	drive.setLeftRightMotorOutputs(leftMotors, rightMotors);
    }
    public void stopDriveMotors() {
    	setLeftRightMotors(0, 0);
    }
}

