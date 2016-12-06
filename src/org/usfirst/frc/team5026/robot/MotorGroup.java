package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class MotorGroup implements SpeedController{
	
	
	Talon[] motors;

	public MotorGroup(Talon[] motors){
		this.motors = new Talon[motors.length];
		for(int i = 0; i < motors.length; i++) {
			this.motors[i] = motors[i];
		}
	}
	
	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(double speed, byte syncGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(double speed, boolean isInverted[]) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 0; i++) {
			if(isInverted[i]) {
				motors[i].set(-speed);
			}
			else() {
				motors[i].set(speed);
			}
		}
	}

	@Override
	public void setInverted(boolean isInverted) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getInverted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotor() {
		// TODO Auto-generated method stub
		
	}
	
}
