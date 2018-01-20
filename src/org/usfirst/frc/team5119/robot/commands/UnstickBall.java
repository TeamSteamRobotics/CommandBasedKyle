package org.usfirst.frc.team5119.robot.commands;

import org.usfirst.frc.team5119.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UnstickBall extends Command {

    public UnstickBall() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.ballSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ballSystem.reverseIntake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ballSystem.stopIntake();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.ballSystem.stopIntake();
    }
}
