package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Hardware;

/**
 *
 */

public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon intakemotor;
	private boolean hasball;
	
	public Intake() {
		intakemotor = Robot.hardware.intake;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public boolean hasBall() {
    	hasball = Robot.hardware.bannersensor.get();
    	return hasball;
    }
    
    public void outake() {
    	intakemotor.set(Constants.OUTAKE_SPEED);
    	
    }
    public void intake() {
    	intakemotor.set(Constants.INTAKE_SPEED);
    }
    
    public void stop() {
    	intakemotor.set(0);
    }
}

