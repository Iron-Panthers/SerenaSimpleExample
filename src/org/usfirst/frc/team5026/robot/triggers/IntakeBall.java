package org.usfirst.frc.team5026.robot.triggers;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeBall extends Command {

    public IntakeBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intake.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.intake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.intake.hasBall();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
