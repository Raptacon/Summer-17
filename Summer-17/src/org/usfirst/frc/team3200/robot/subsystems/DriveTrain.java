package org.usfirst.frc.team3200.robot.subsystems;

import org.usfirst.frc.team3200.robot.OI;
import org.usfirst.frc.team3200.robot.RobotMap;
import org.usfirst.frc.team3200.robot.commands.DriveControlled;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private RobotDrive drive;
	//Declare talons
    CANTalon talonFR;
    CANTalon talonFL;
    CANTalon talonBR;
    CANTalon talonBL;
    
    public DriveTrain(){
    	//Initialize talons
    	talonFR = new CANTalon(RobotMap.TALON_FR);
    	talonFL = new CANTalon(RobotMap.TALON_FL);
    	talonBR = new CANTalon(RobotMap.TALON_BR);
    	talonBL = new CANTalon(RobotMap.TALON_BL);
    	
    	//Assign encoders to talons
    	talonFR.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	talonFL.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		talonBR.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		talonBL.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		
		//Sets motors to be inverted- reverses encoders as well
		talonBL.setInverted(true);
		talonFL.setInverted(true);
		talonBL.reverseSensor(true);
		talonFL.reverseSensor(true);
		
		//drive acts as the software version of the robot drivetrain
		drive = new RobotDrive(talonFR, talonBR, talonFL, talonBL);
    }
    
    public void setMecanum(double x, double y, double rot) {
		drive.mecanumDrive_Cartesian(x, y, rot, 0);
	}
    
    public double getDistance() {
		SmartDashboard.putNumber("Front Right Encoder Count:", talonFR.getPosition());
		SmartDashboard.putNumber("Back Right Encoder Count:", talonBR.getPosition());
		SmartDashboard.putNumber("Front Left Encoder Count:", talonFL.getPosition());
		SmartDashboard.putNumber("Back Left Encoder Count:", talonBL.getPosition());
	    
		return (talonFR.getPosition() +
				talonBR.getPosition() +
				talonFL.getPosition() +
				talonBL.getPosition()
				//Conversion factor to be determined
				);
	}

    
    public void initDefaultCommand() {
        this.setDefaultCommand(new DriveControlled(OI.CONTROLLER_1));
    }
}

