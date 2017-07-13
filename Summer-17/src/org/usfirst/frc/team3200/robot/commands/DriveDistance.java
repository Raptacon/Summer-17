package org.usfirst.frc.team3200.robot.commands;


import org.usfirst.frc.team3200.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveDistance extends Command {
	int distance;
    public DriveDistance(int distance) {
    	super("DriveDistance");
    	requires(Robot.drivetrain);
        this.distance = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.setMecanum(.7,0,0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return distance <= Robot.drivetrain.getDistance();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.setMecanum(0,0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.setMecanum(0,0,0);
    }
}
