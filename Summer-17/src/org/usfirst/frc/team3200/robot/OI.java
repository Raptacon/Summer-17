package org.usfirst.frc.team3200.robot;

import org.usfirst.frc.team3200.robot.commands.Print;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick CONTROLLER_1 = new Joystick(0);
	
	public Button buttonX;
	public Button buttonY;
	
	public OI(){
		buttonX = new Button(CONTROLLER_1, RobotMap.BUTTON_X);
		buttonY = new Button(CONTROLLER_1, RobotMap.BUTTON_Y);
		
		buttonX.whenPressed(new Print());
		buttonY.whenPressed(new DriveDistance(10));
		
	}
}
