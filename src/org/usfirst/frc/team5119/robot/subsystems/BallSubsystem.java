package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.Robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallSubsystem extends Subsystem {
	Talon ballIntakeMotor=new Talon(2);
	Talon bottomLaunchMotor=new Talon(3);
	Talon topLaunchMotor=new Talon(4);
	public DigitalInput ballSensor = new DigitalInput(0);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void intake(){
    	ballIntakeMotor.set(-0.45);
    }
    public void stopIntake(){
    	ballIntakeMotor.set(0);
    }
    public void reverseIntake(){
    	ballIntakeMotor.set(0.5);
    }
    public void launch(){
    	bottomLaunchMotor.set(-1);
    	topLaunchMotor.set(1);
    	Timer.delay(1);
    	ballIntakeMotor.set(-0.5);
    }
    public void launchDone(){
    	bottomLaunchMotor.set(0);
    	topLaunchMotor.set(0);
    	ballIntakeMotor.set(0);
    	
    }
    public void lowerBall(){
    	bottomLaunchMotor.set(0.5);
    }
}

