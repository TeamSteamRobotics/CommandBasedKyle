package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.OI;
import org.usfirst.frc.team5119.robot.RobotMap;
import org.usfirst.frc.team5119.robot.commands.Drive;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	CANTalon frontLeft = new CANTalon(RobotMap.frontLeft);
	CANTalon frontRight = new CANTalon(RobotMap.frontRight);
	CANTalon backLeft = new CANTalon(RobotMap.backLeft);
	CANTalon backRight = new CANTalon(RobotMap.backRight);
	//public RobotDrive drive = new RobotDrive(frontLeft,backLeft,frontRight,backRight);
	public RobotDrive drive = new RobotDrive(0,1);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }
    public void drive(){
    	drive.arcadeDrive(-OI.stick.getY(), -OI.stick.getX(), true);
    	//frontLeft.set(1);
    	/*if (OI.stick.getRawButton(3))
    	{
    		drive.arcadeDrive(0.5, 0, true);
    	} else {
    		drive.arcadeDrive(-OI.stick.getY(), -OI.stick.getX(), true);
    	}
    	*/
    }
}
